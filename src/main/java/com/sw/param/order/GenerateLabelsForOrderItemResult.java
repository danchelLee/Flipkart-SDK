package com.sw.param.order;

import com.sw.param.listing.FlipKartErrorInfo;

import java.util.Arrays;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 11:11 2019/4/13
 */
public class GenerateLabelsForOrderItemResult {
    private FlipKartErrorInfo[] errors;
    private String message;
    private String code;

    private FlipKartLabelOrderItem[] orderItems;

    public GenerateLabelsForOrderItemResult() {
    }

    public FlipKartErrorInfo[] getErrors() {
        return errors;
    }

    public void setErrors(FlipKartErrorInfo[] errors) {
        this.errors = errors;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public FlipKartLabelOrderItem[] getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(FlipKartLabelOrderItem[] orderItems) {
        this.orderItems = orderItems;
    }

    @Override
    public String toString() {
        return "GenerateLabelsForOrderItemResult{" +
                "errors=" + Arrays.toString(errors) +
                ", message='" + message + '\'' +
                ", code='" + code + '\'' +
                ", orderItems=" + Arrays.toString(orderItems) +
                '}';
    }
}
