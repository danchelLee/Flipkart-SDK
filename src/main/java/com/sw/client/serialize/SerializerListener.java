package com.sw.client.serialize;

import java.util.Map;

public interface SerializerListener {
    public void onRequestSerialized(Map<String, Object> serializedRequest);

}
