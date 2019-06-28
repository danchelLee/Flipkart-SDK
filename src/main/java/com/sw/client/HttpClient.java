package com.sw.client;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.sw.client.entity.AuthorizationToken;
import com.sw.client.entity.Headers;
import com.sw.client.entity.URLParam;
import com.sw.client.enums.Environment;
import com.sw.client.policy.RequestPolicy;
import com.sw.common.SDKResult;

import javax.net.ssl.HttpsURLConnection;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Base64;
import java.util.Map;
import java.util.logging.Logger;
import java.util.zip.GZIPInputStream;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 10:21 2019/3/29
 */
public class HttpClient {

    public static final String CONTENT_ENCODING_GZIP = "gzip";

    public static final String CONTENT_ENCODING_PDF = "PDF";

    public static final String CONTENT_ENCODING_STREAM = "octet-stream";

    public static final String LISTING_PACKAGE_NAME = "listing";
    public static final String JSON_STR = "json";
    private static final int SUCCESS_CODE_START = 200;
    private static final int SUCCESS_CODE_END = 299;
    private static final int WARNING_CODE = 399;

    private static Logger logger = Logger.getLogger("HttpClient");

    public static Response doGet(String path, Request request, Headers headers){

        Response response = new Response();

        HttpsURLConnection conn = null;
        URL url ;
        try {
            APIId apiId = request.getApiId();
            String contentType = "";
            String pathParam = apiId.toString();
            if (pathParam.contains(CONTENT_ENCODING_PDF)) {
                pathParam = pathParam.replace(CONTENT_ENCODING_PDF, "");
                contentType = CONTENT_ENCODING_PDF;
            } else if (pathParam.contains(JSON_STR)) {
                pathParam = pathParam.replace(JSON_STR, "");
                contentType = JSON_STR;
            }
            url = new URL(path.concat(pathParam));
            conn = (HttpsURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            if (CONTENT_ENCODING_PDF.equals(contentType)) {
                conn.setRequestProperty("Content-type", "application/pdf");
            }else if (JSON_STR.equals(contentType)){
                conn.setRequestProperty("Content-type", "application/json");
            }else {
                conn.setRequestProperty("Content-type", "application/x-www-form-urlencoded");
            }
            conn.setDoInput(true);
            conn.setDoOutput(true);
            for (Map.Entry<String, String> entry : headers.getHeader().entrySet()) {
                conn.setRequestProperty(entry.getKey(), entry.getValue());
            }

            int httpCode = conn.getResponseCode();
            InputStream inputStream ;
            if (httpCode >= SUCCESS_CODE_START && httpCode <= SUCCESS_CODE_END) {
                inputStream = conn.getInputStream();
            } else {
                inputStream = conn.getErrorStream();
            }
            response.setStatusCode(httpCode);
            if (CONTENT_ENCODING_GZIP.equalsIgnoreCase(response.getEncoding())) {
                logger.info(" translate InputStream to GZIPInputStream ");
                inputStream = new GZIPInputStream(inputStream);
            }

            logger.info("Response status code :" + response.getStatusCode());
            if (response.getStatusCode() >= SUCCESS_CODE_START && response.getStatusCode() <= WARNING_CODE) {
                if (CONTENT_ENCODING_STREAM.equalsIgnoreCase(response.getEncoding())){
                    logger.info(" translate InputStream to InputStream");
                    inputStream = conn.getInputStream();
                    response.setInputStream(inputStream);
                }else if(CONTENT_ENCODING_PDF.equalsIgnoreCase(response.getEncoding())){
                    logger.info("translate InputStream to InputStream PDF");
                    inputStream = conn.getInputStream();
                    response.setInputStream(inputStream);
                } else {
                    Object result = parseBody(inputStream, response.getCharset());
                    response.setResult(result);
                }

            } else {
                Object errorInfos = buildException(inputStream, response.getCharset(), httpCode);
                response.setErrors(errorInfos);
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (conn != null) {
                conn.disconnect();
            }
            return response;
        }
    }

    private static Object buildException(InputStream inputStream, String charset,int statusCode) {
        logger.info("Build exception  code>>>".concat(statusCode+"").concat("."));
        String str = getStreamAsString(inputStream,charset);
        str = str.replace("[","");
        str = str.replace("]","");
        JSONObject jsonObject = JSON.parseObject(str);
        Object result = JSON.toJavaObject(jsonObject,Object.class);
        return result;
    }

    private static Object parseBody(InputStream inputStream,String charSet) {
        logger.info("Parse body by json.");
        String str = getStreamAsString(inputStream,charSet);
        if (str.substring(0,1).contains("[")){
            StringBuilder sb = new StringBuilder(str);
            sb.replace(0,1,"");
            sb.replace(sb.length()-1,sb.length(),"");
            str = sb.toString();
        }
        JSONObject jsonObject = JSON.parseObject(str);
        Object result = JSON.toJavaObject(jsonObject,Object.class);
        return result;
    }

    private static String getStreamAsString(InputStream inputStream, String charSet) {
        Reader reader;
        StringBuilder response = new StringBuilder();
        final char[] buff = new char[1024];
        int read;
        try {
            reader = new InputStreamReader(inputStream, charSet);
            while ((read = reader.read(buff)) > 0) {
                response.append(buff, 0, read);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return response.toString();
    }

    public static Response doPost(Request request, Headers headers,Map<String,Object> parameters,String path){
        Response response = new Response();
        logger.info("path:".concat(request.apiId.toString()));
        logger.info("parameters:".concat(parameters.toString()));
        HttpsURLConnection conn = null;
        OutputStream out;
        try {
            URL url = new URL(path.concat(request.apiId.toString()));
            conn = (HttpsURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-type","application/json");
            conn.setDoInput(true);
            conn.setDoOutput(true);
            for (Map.Entry<String,String> entry : headers.getHeader().entrySet()) {
                conn.setRequestProperty(entry.getKey(),entry.getValue());
            }
            JSONObject jsonObject = new JSONObject();
            for ( Map.Entry<String,Object> entry : parameters.entrySet() ) {
                jsonObject.put(entry.getKey(), entry.getValue());
            }
            String query = JSON.toJSONString(jsonObject,SerializerFeature.DisableCircularReferenceDetect);
            byte[] content = {};
            if (query != null) {
                content = query.getBytes("UTF-8");
            }
            out = conn.getOutputStream();
            out.write(content);

            int httpCode = conn.getResponseCode();
            String contentType = conn.getContentType();
            InputStream inputStream ;
            if (httpCode >= SUCCESS_CODE_START && httpCode <= SUCCESS_CODE_END) {
                inputStream = conn.getInputStream();
            } else {
                inputStream = conn.getErrorStream();
            }

            response.setStatusCode(httpCode);
            if (CONTENT_ENCODING_GZIP.equalsIgnoreCase(response.getEncoding())) {
                logger.info(" translate InputStream to GZIPInputStream ");
                inputStream = new GZIPInputStream(inputStream);
            }
            logger.info("Response status code :" + response.getStatusCode());
            if (response.getStatusCode() >= SUCCESS_CODE_START && response.getStatusCode() <= WARNING_CODE) {
                if (contentType.contains(JSON_STR)) {
                    Object result = parseBody(inputStream, response.getCharset());
                    response.setResult(result);
                }
            } else {
                Object errorInfos = buildException(inputStream, response.getCharset(), httpCode);
                response.setErrors(errorInfos);
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (conn != null) {
                conn.disconnect();
            }
        }
        return response;
    }

    public <T> T send(Request apiRequest, Environment environment, Headers headers) {
        Response response;
        SDKResult<T> sdkResult = new SDKResult<>();
        if (RequestPolicy.HttpMethodPolicy.GET.equals(apiRequest.getHttpMethod())) {
            response = doGet(environment.getSellerEndpoint(), apiRequest, headers);
        } else {
            response = doPost(apiRequest, headers, apiRequest.getAddtionalParams(), environment.getSellerEndpoint());
        }
        if (response.getStatusCode() >= SUCCESS_CODE_START && response.getStatusCode() <= WARNING_CODE) {
            sdkResult.setStatusCode(response.getStatusCode() + "");
            if (response.getResult() != null) {
                if (apiRequest.getResponseClass().getPackage().getName().toLowerCase().contains(LISTING_PACKAGE_NAME)
                        &&apiRequest.getResponseClass().getName().toLowerCase().contains("update") ) {
                    JSONObject jsonObject = (JSONObject) response.getResult();
                    JSONObject jObj = new JSONObject();
                    for (Map.Entry<String, Object> entry : jsonObject.entrySet()) {
                        jObj = (JSONObject) entry.getValue();
                    }
                    sdkResult.setResult((T) jObj.toJavaObject(apiRequest.getResponseClass()));
                } else {
                    sdkResult.setResult((T) ((JSONObject) response.getResult()).toJavaObject(apiRequest.getResponseClass()));
                }
            }
        } else {
            sdkResult.setErrorCode(response.getStatusCode() + "");
            if (response.getErrors() != null) {
                sdkResult.setResult((T) ((JSONObject) response.getErrors()).toJavaObject(apiRequest.getResponseClass()));
            }
        }
        return (T) sdkResult;
    }

    public AuthorizationToken getToken(Environment environment, String appKey, String secKey) {
        Request request = new Request("oauth-service/oauth", "token");
        APIId apiId = request.getApiId();
        URLParam urlParam = new URLParam();
        urlParam.addURLParams("grant_type", "client_credentials");
        urlParam.addURLParams("scope", "Seller_Api");
        apiId.setParam(urlParam);
        Base64.Encoder encoder = Base64.getEncoder();
        String idAndKey = encoder.encodeToString(new String(appKey.concat(":").concat(secKey)).getBytes());
        Headers headers = new Headers();
        headers.putAuthorization(idAndKey);
        AuthorizationToken authorizationToken = ((JSONObject) HttpClient.doGet(environment.getApiEndpoint(), request, headers).getResult()).toJavaObject(AuthorizationToken.class);
        return authorizationToken;
    }

}
