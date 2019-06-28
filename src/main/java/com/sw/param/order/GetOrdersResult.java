package com.sw.param.order;

import com.sw.param.listing.FlipKartErrorInfo;

import java.util.Arrays;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 10:10 2019/4/13
 */
public class GetOrdersResult {
    private FlipKartOrderItem[] orderItems;
    private String error;
    private String error_description;
    private String message;
    private FlipKartErrorInfo[] errors;

    public GetOrdersResult() {
    }

    public FlipKartOrderItem[] getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(FlipKartOrderItem[] orderItems) {
        this.orderItems = orderItems;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getError_description() {
        return error_description;
    }

    public void setError_description(String error_description) {
        this.error_description = error_description;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public FlipKartErrorInfo[] getErrors() {
        return errors;
    }

    public void setErrors(FlipKartErrorInfo[] errors) {
        this.errors = errors;
    }

    @Override
    public String toString() {
        return "GetOrdersResult{" +
                "orderItems=" + Arrays.toString(orderItems) +
                ", error='" + error + '\'' +
                ", error_description='" + error_description + '\'' +
                ", message='" + message + '\'' +
                ", errors=" + Arrays.toString(errors) +
                '}';
    }
}
