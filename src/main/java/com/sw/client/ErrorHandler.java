package com.sw.client;

import com.sw.client.exception.SwException;

/**
 * 类ErrorHandler.java的实现描述：业务异常处理
 */
public interface ErrorHandler {
    void handle(SwException targetException);
}
