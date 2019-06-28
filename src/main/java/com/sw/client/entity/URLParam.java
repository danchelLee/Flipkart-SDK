package com.sw.client.entity;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Dc Lee
 * @Descpription: URL携带请求参数
 * @Date: 12:02 2019/4/4
 */
public class URLParam {

    private Map<String,Object> params = new HashMap<String,Object>();

    public URLParam() {
    }

    public URLParam(Map params){
        this.params = params;
    }

    public void addURLParams(String key, Object param){
        params.put(key,param);
    }

    public Map<String, Object> getParams() {
        return params;
    }
}
