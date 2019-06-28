package com.sw.common;

import com.sw.client.APIId;
import com.sw.client.policy.RequestPolicy;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 14:54 2019/4/1
 */
public abstract class AbstractAPIRequest<TResponse> {

    protected RequestPolicy swRequestPolicy = new RequestPolicy();

    protected APIId swApiId;

    public RequestPolicy getSwRequestPolicy() {
        return swRequestPolicy;
    }

    public void setSwRequestPolicy(RequestPolicy swRequestPolicy) {
        this.swRequestPolicy = swRequestPolicy;
    }

    public APIId getSwApiId() {
        return swApiId;
    }

    public void setSwApiId(APIId swApiId) {
        this.swApiId = swApiId;
    }

    public Class<TResponse> getResponseClass() {
        Type type = this.getClass().getGenericSuperclass();

        ParameterizedType parameterizedType = (ParameterizedType) this.getClass().getGenericSuperclass();
        return (Class) parameterizedType.getActualTypeArguments()[0];
    }
}
