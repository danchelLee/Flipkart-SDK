package com.sw.client.http.platform;

import com.sw.client.Response;
import com.sw.client.http.HttpResponseBuilder;

import java.io.InputStream;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 16:51 2019/4/1
 */
public class DefaultHttpResponseBuilder implements HttpResponseBuilder {

    /**
     * @param istream
     * @param httpCode
     * @param contentEncoding
     * @return
     */
    @Override
    public Response buildResponse(InputStream istream, int httpCode, String contentEncoding) {



        return null;
    }
}
