package com.sw.client.serialize;

import java.util.Map;

public interface Serializer {
    /**
     * 返回该反序列化接口支持的数据协议.
     *
     * @see com.sw.client.policy
     * @return
     */
    public String supportedContentType();

    /**
     * 序列化方法
     *
     * @param serializer
     * @return
     */
    public Map<String, Object> serialize(Object serializer);

    /**
     *
     * @param listner
     */
    public void registeSerializerListener(SerializerListener listner);
}
