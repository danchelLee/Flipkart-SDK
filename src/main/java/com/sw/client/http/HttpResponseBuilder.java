package com.sw.client.http;

import com.sw.client.Response;

import java.io.InputStream;

public interface HttpResponseBuilder {

    /**
     *
     * @param istream
     * @param httpCode
     * @param contentEncoding
     * @return
     */
    public Response buildResponse(InputStream istream, int httpCode, String contentEncoding);

}
