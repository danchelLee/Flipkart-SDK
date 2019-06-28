package com.sw.client.entity;

import java.io.Serializable;
import java.util.Objects;

/**
 * @Author: Dc Lee
 * @Descpription: 授权返回结果
 * @Date: 10:11 2019/4/4
 */
public class AuthorizationToken implements Serializable {

    private static final long serialVersionUID = -7582222338466164367L;

    private String access_token;
    private String token_type;
    private Integer expires_in;
    private String scope;

    public AuthorizationToken() {
    }

    public AuthorizationToken(String access_token, String token_type, Integer expires_in, String scope) {
        this.access_token = access_token;
        this.token_type = token_type;
        this.expires_in = expires_in;
        this.scope = scope;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getToken_type() {
        return token_type;
    }

    public void setToken_type(String token_type) {
        this.token_type = token_type;
    }

    public Integer getExpires_in() {
        return expires_in;
    }

    public void setExpires_in(Integer expires_in) {
        this.expires_in = expires_in;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AuthorizationToken that = (AuthorizationToken) o;
        return Objects.equals(access_token, that.access_token) &&
                Objects.equals(token_type, that.token_type) &&
                Objects.equals(expires_in, that.expires_in) &&
                Objects.equals(scope, that.scope);
    }

    @Override
    public int hashCode() {
        return Objects.hash(access_token, token_type, expires_in, scope);
    }

    @Override
    public String toString() {
        return "AuthorizationToken{" +
                "access_token='" + access_token + '\'' +
                ", token_type='" + token_type + '\'' +
                ", expires_in=" + expires_in +
                ", scope='" + scope + '\'' +
                '}';
    }
}
