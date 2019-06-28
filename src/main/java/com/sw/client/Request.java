package com.sw.client;

import com.sw.client.entity.AuthorizationToken;
import com.sw.client.policy.RequestPolicy;
import com.sw.common.AbstractAPIRequest;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 14:52 2019/4/1
 */
public class Request<TResponse> {

    public static final String ACCESS_TOKEN = "access_token";

    private Map<String, Object> addtionalParams = new HashMap<String, Object>();
    private AbstractAPIRequest requestEntity;
    private String authCodeKey;
    private String accessToken;
    private AuthorizationToken authToken;
    protected APIId apiId;
    protected RequestPolicy.HttpMethodPolicy httpMethod = RequestPolicy.HttpMethodPolicy.POST;

    public Request(){
    }

    public Request(String namespace , String name){
        apiId = new APIId(namespace,name);
    }

    /**
     * 使用API唯一标示：namespace，name，version构建一个API request
     *
     * @param namespace
     * @param name
     * @param version
     */
    public Request(String namespace, String name, int version) {
        apiId = new APIId(namespace, name, version);
    }

    public Request(APIId apiId) {
        this.apiId = apiId;
    }

    public APIId getApiId() {
        return apiId;
    }

    public void addAddtionalParams(String key, Object param) {
        addtionalParams.put(key, param);
    }

    public String getAuthCodeKey() {
        return authCodeKey;
    }

    public Request setAuthCodeKey(String authCodeKey) {
        this.authCodeKey = authCodeKey;
        return this;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public Request setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        addtionalParams.put(ACCESS_TOKEN, accessToken);
        return this;
    }

    public AuthorizationToken getAuthToken() {
        return authToken;
    }

    public Request setAuthToken(AuthorizationToken authToken) {
        this.authToken = authToken;
        return this;
    }

    public AbstractAPIRequest getRequestEntity() {
        return requestEntity;
    }

    public void setRequestEntity(AbstractAPIRequest requestEntity) {
        this.requestEntity = requestEntity;
    }

    public Map<String, Object> getAddtionalParams() {
        return addtionalParams;
    }

    public RequestPolicy.HttpMethodPolicy getHttpMethod() {
        return httpMethod;
    }

    public void setHttpMethod(RequestPolicy.HttpMethodPolicy httpMethod) {
        this.httpMethod = httpMethod;
    }

    public Class<TResponse> getResponseClass() {
        Type type = this.getClass().getGenericSuperclass();

        ParameterizedType parameterizedType = (ParameterizedType) this.getClass().getGenericSuperclass();
        return (Class) parameterizedType.getActualTypeArguments()[0];
    }
}
