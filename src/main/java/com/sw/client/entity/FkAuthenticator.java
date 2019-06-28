package com.sw.client.entity;

import java.net.Authenticator;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 14:41 2019/4/2
 */
public class FkAuthenticator extends Authenticator {

    private String appId;
    private String appSecret;

    public FkAuthenticator() {
    }

    public FkAuthenticator(String appId, String appSecret) {
        this.appId = appId;
        this.appSecret = appSecret;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppSecret() {
        return appSecret;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }
}
