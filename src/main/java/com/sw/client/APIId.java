package com.sw.client;

import com.sw.client.entity.URLParam;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 11:45 2019/4/4
 */
public class APIId implements Serializable {

    private static final long serialVersionUID = 3310099984731564724L;

    public static final int DEFAULT_VERSION = 1;

    private String namespace;
    private String name;
    private int version;
    private URLParam param;


    public APIId(){
        super();
    }

    public APIId(String namespace,String name){
        this(namespace,name,DEFAULT_VERSION);
    }

    public APIId(String namespace, String name, int version) {
        this.namespace = namespace;
        this.name = name;
        this.version = version;
    }

    public String getNamespace() {
        return namespace;
    }

    public String getName() {
        return name;
    }

    public int getVersion() {
        return version;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public URLParam getParam() {
        return param;
    }

    public void setParam(URLParam param) {
        this.param = param;
    }

    @Override
    public String toString(){
        StringBuilder url = new StringBuilder().append("/").append(namespace).append("/").append(name);
        if (param != null) {
            url.append("?");
            Iterator<Map.Entry<String, Object>> it = param.getParams().entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, Object> entry = it.next();
                url.append(entry.getKey()).append("=").append(entry.getValue());
                if (it.hasNext()) {
                    url.append("&");
                }
            }
        }
        return url.toString();
    }
}
