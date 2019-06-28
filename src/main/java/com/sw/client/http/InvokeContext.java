package com.sw.client.http;

import com.sw.client.Request;
import com.sw.client.Response;
import com.sw.client.entity.ResponseWrapper;
import com.sw.client.policy.RequestPolicy;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 18:19 2019/4/1
 */
public class InvokeContext {
    private Request request;
    private Response response;
    private RequestPolicy policy;
    private Class<?> resultType;
    private ResponseWrapper responseWrapper;

    public InvokeContext() {
    }

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public Response getResponse() {
        return response;
    }

    public synchronized void setResponse(Response response) {
        this.response = response;
    }

    public RequestPolicy getPolicy() {
        return policy;
    }

    public void setPolicy(RequestPolicy policy) {
        this.policy = policy;
    }

    public Class<?> getResultType() {
        return resultType;
    }

    public void setResultType(Class<?> resultType) {
        this.resultType = resultType;
    }

    public ResponseWrapper getResponseWrapper() {
        return responseWrapper;
    }

    public void setResponseWrapper(ResponseWrapper responseWrapper) {
        this.responseWrapper = responseWrapper;
    }

    public synchronized void failed(Throwable exception) {
        if (response == null) {
            response = new Response();
        }
       // response.setException(exception);
    }
}
