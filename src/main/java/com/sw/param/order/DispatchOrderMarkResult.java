package com.sw.param.order;

import java.util.Arrays;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 9:55 2019/4/15
 */
public class DispatchOrderMarkResult {

    /**
     * {
     *   "orderItems": [
     *     {
     *       "orderItemId": "",
     *       "processingStatus": "",
     *       "errorCode": "",
     *       "errorMessage": ""
     *     }
     *   ]
     * }
     */
    private FlipKartLabelOrderItem[] orderItems;
    private String code;
    private String message;

    public DispatchOrderMarkResult() {
    }

    public FlipKartLabelOrderItem[] getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(FlipKartLabelOrderItem[] orderItems) {
        this.orderItems = orderItems;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "DispatchOrderMarkResult{" +
                "orderItems=" + Arrays.toString(orderItems) +
                ", code='" + code + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
