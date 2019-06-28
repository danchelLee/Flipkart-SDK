package com.sw.common;



import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.sw.client.HttpClient;
import com.sw.client.Request;
import com.sw.client.entity.AuthorizationToken;
import com.sw.client.entity.Headers;
import com.sw.client.enums.Environment;
import com.sw.param.listing.*;
import com.sw.param.order.*;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 10:00 2019/4/4
 */
public class ApiExecutor {

    private Environment environment;
    private int httpPort = 80;
    private int httpsPort = 443;
    private String appKey;
    private String secKey;
    private String token;

    public ApiExecutor(Environment environment,String appKey, String secKey) {
        super();
        this.appKey = appKey;
        this.secKey = secKey;
        this.environment = environment;
    }

    public ApiExecutor(Environment environment, int httpPort, int httpsPort, String appKey, String secKey) {
        super();
        this.environment = environment;
        this.httpPort = httpPort;
        this.httpsPort = httpsPort;
        this.appKey = appKey;
        this.secKey = secKey;
    }

    public ApiExecutor(Environment environment,String token){
        this.token = token;
        this.environment = environment;
    }

    private HttpClient getHttpClient(){
        return new HttpClient();
    }

    /**
     * 获取token
     * @return
     */
    public final AuthorizationToken getToken(){
        AuthorizationToken authorizationToken = getHttpClient().getToken(environment,appKey,secKey);
        return authorizationToken;
    }

    public final <TResponse> SDKResult<TResponse> execute(Request<TResponse> apiRequest){
        Headers headers = new Headers();
        headers.putTokenHeader(token);
        SDKResult<TResponse> sdkResult = getHttpClient().send(apiRequest,environment,headers);
        return sdkResult;
    }


}
