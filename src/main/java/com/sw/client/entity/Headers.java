package com.sw.client.entity;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 14:27 2019/4/4
 */
public class Headers {

    Map<String,String> header = new HashMap<String,String>();

    public void putAuthorization(String value){
        header.put("Authorization","Basic ".concat(value));
    }

    public void putTokenHeader(String value){
        header.put("Authorization","Bearer ".concat(value));
    }

    public void addHeader(String key,String value){
        header.put(key,value);
    }

    public Map<String, String> getHeader() {
        return header;
    }
}
