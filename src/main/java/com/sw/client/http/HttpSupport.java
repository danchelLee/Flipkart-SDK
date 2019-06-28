package com.sw.client.http;

import com.sw.client.Request;
import com.sw.client.policy.RequestPolicy;
import com.sw.client.serialize.Serializer;
import com.sw.util.DateUtil;
import com.sw.util.GenericsUtil;

import java.io.IOException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 18:17 2019/4/1
 */
public final class HttpSupport {
    public static final String METHOD_GET = "GET";
    public static final String METHOD_POST = "POST";

    public static final char QUERY_STRING_SEPARATOR = '?';
    public static final char PARAMETER_SEPARATOR = '&';
    public static final char NAME_VALUE_SEPARATOR = '=';

    public static final String PARAM_NAME_SIGNATURE = "_aop_signature";
    public static final String PARAM_NAME_TIMESTAMP = "_aop_timestamp";
    public static final String PARAM_NAME_DATEPATTERN = "_aop_datePattern";
    public static final String PARAM_NAME_RESPONSE_FORMAT = "_aop_responseFormat";
    public static final String PARAM_NAME_ACCESS_TOKEY = "access_token";

    public final static Map<String, String> buildHttpHeader(InvokeContext context) {
        Map<String, String> header = new LinkedHashMap<String, String>();
        header.put("Accept", "text/xml,text/javascript,application/json");
        return header;
    }

    /**
     *
     * @param requestPolicy
     * @return
     */
    public final static StringBuilder getApiRequestPath(RequestPolicy requestPolicy) {
        StringBuilder path = new StringBuilder();
        if (requestPolicy.isAccessPrivateApi()) {
            path.append("/api");
        } else {
            path.append("/openapi");
        }
        return path;
    }

    /**
     *
     * @param params
     * @param charset
     * @return
     * @throws IOException
     */
    public static String buildQuery(Map<String, Object> params) throws IOException {
        if (params == null || params.isEmpty()) {
            return "";
        }
        StringBuilder query = new StringBuilder();
        Set<Map.Entry<String, Object>> entries = params.entrySet();
        boolean hasParam = false;

        for (Map.Entry<String, Object> entry : entries) {
            String name = entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                if (hasParam) {
                    query.append("&");
                } else {
                    hasParam = true;
                }
                query.append(name).append("=").append(URLEncoder.encode(String.valueOf(value), "utf-8"));
            }
        }

        return query.toString();
    }

    public static String parseResponseCharset(RequestPolicy requestPolicy, String ctype) {
        String charset = requestPolicy.getContentCharset();

        if (!GenericsUtil.isBlank(ctype)) {
            String[] params = ctype.split(";");
            for (String param : params) {
                param = param.trim();
                if (param.startsWith("charset")) {
                    String[] pair = param.split("=", 2);
                    if (pair.length == 2) {
                        if (!GenericsUtil.isBlank(pair[1])) {
                            charset = pair[1].trim();
                        }
                    }
                    break;
                }
            }
        }
        return charset;
    }

    /**
     *
     * @param serializerProvider
     * @param context
     * @return
     */
    public static Map<String, Object> buildParams(Serializer serializer, InvokeContext context) {
        Map<String, Object> serializerMap = serializer.serialize(context.getRequest().getRequestEntity());

        serializerMap.putAll(context.getRequest().getAddtionalParams());

        RequestPolicy requestPolicy = context.getPolicy();
        if (!requestPolicy.getRequestProtocol().equals(requestPolicy.getResponseProtocol())) {
            serializerMap.put(PARAM_NAME_RESPONSE_FORMAT, requestPolicy.getResponseProtocol().name());
        }
        if (requestPolicy.isRequestSendTimestamp()) {
            serializerMap.put(PARAM_NAME_TIMESTAMP, System.currentTimeMillis());
        }

        if (requestPolicy.getDateFormat() != null) {
            serializerMap.put(PARAM_NAME_DATEPATTERN, requestPolicy.getDateFormat());
        } else {
            serializerMap.put(PARAM_NAME_DATEPATTERN, DateUtil.SIMPLE_DATE_FORMAT_STR);
        }

        return serializerMap;
    }
}
