package com.sw.client;

import com.sw.param.listing.FlipKartErrorInfo;

import javax.xml.ws.ResponseWrapper;
import java.io.InputStream;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 15:53 2019/4/1
 */
public class Response {
    private static final String DEFAULT_CHARSET = "UTF-8";
    private int statusCode;
    private Object result;
    private Object errors;
    private String charset = DEFAULT_CHARSET;
    private String encoding;
    private ResponseWrapper responseWrapper;
    private String message;
    private String code;
    private InputStream inputStream;

    public Response setResult(Object result) {
        this.result = result;
        return this;
    }

    public Object getResult() {
        return result;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public Object getErrors() {
        return errors;
    }

    public void setErrors(Object errors) {
        this.errors = errors;
    }

    public ResponseWrapper getResponseWrapper() {
        return responseWrapper;
    }

    public void setResponseWrapper(ResponseWrapper responseWrapper) {
        this.responseWrapper = responseWrapper;
    }

    public String getCharset() {
        return charset;
    }

    public void setCharset(String charset) {
        this.charset = charset;
    }

    public String getEncoding() {
        return encoding;
    }

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public InputStream getInputStream() {
        return inputStream;
    }

    public void setInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }
}
