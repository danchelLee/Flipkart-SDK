package com.sw.common;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 10:57 2019/4/9
 */
public class SDKResult<T> {
    private String errorCode;
    private String errorMessage;
    private String statusCode;

    private T result;

    public SDKResult(String errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public SDKResult(T result) {
        this.result = result;
    }

    public SDKResult() {
        super();
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    @Override
    public String toString() {
        return "SDKResult{" +
                "errorCode='" + errorCode + '\'' +
                ", errorMessage='" + errorMessage + '\'' +
                ", statusCode='" + statusCode + '\'' +
                ", result=" + result +
                '}';
    }
}
