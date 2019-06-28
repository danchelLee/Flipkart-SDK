package com.sw.util;

import com.sw.client.exception.SwException;

import java.io.IOException;
import java.util.Map;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 17:41 2019/4/1
 */
public class ExceptionParser {

    /**
     * for Protocol.Json2
     *
     * @param exption
     * @return the new exception
     * @throws IOException
     */
    @SuppressWarnings("unchecked")
    public static Throwable buildException4Json2(Map exption) {
        Map<String, Object> m = exption;

        String errorCodeStr = (String) m.get("error_code");
        String errorMesage = (String) m.get("error_message");

        if (errorCodeStr == null) {
            errorCodeStr = (String) m.get("errorCode");
        }

        if (errorMesage == null) {
            errorMesage = (String) m.get("errorMessage");
        }

        // if null ,then just return the result
        if (GenericsUtil.isBlank(errorMesage)) {
            errorMesage = "Unknow message defined in response.";
        }
        return buildException(errorCodeStr, errorMesage);
    }

    @SuppressWarnings("unchecked")
    public static Throwable buildException4OAuth2(Object exption) {
        Map<String, Object> m = (Map<String, Object>) exption;
        int errorCode = 401;
        String errorMesage = (String) m.get("error_description");
        return buildException(errorCode, errorMesage);
    }

    private static Throwable buildException(int errorCode, String errorMesage) {

        return new SwException(String.valueOf(errorCode), errorMesage);
    }

    private static Throwable buildException(String errorCode, String errorMesage) {
        return new SwException(errorCode, errorMesage);
    }
}
