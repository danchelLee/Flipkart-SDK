package com.sw.client.entity;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 18:22 2019/4/1
 */
public class ResponseStatus {
    private String code;
    private String message;
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
}
