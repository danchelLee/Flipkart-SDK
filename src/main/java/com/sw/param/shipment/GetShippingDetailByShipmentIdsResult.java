package com.sw.param.shipment;

import com.sw.param.listing.FlipKartErrorInfo;

import java.util.Arrays;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 11:38 2019/4/16
 */
public class GetShippingDetailByShipmentIdsResult {
    private FlipKartShipmentDetail[] shipments;
    private String error;
    private String error_description;
    private String message;
    private FlipKartErrorInfo[] errors;

    public GetShippingDetailByShipmentIdsResult() {
    }

    public FlipKartShipmentDetail[] getShipments() {
        return shipments;
    }

    public void setShipments(FlipKartShipmentDetail[] shipments) {
        this.shipments = shipments;
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
        return "GetShippingDetailByShipmentIdsResult{" +
                "shipments=" + shipments +
                ", error='" + error + '\'' +
                ", error_description='" + error_description + '\'' +
                ", message='" + message + '\'' +
                ", errors=" + Arrays.toString(errors) +
                '}';
    }
}
