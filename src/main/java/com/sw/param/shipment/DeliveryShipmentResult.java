package com.sw.param.shipment;

import com.sw.param.listing.FlipKartErrorInfo;

import java.util.Arrays;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 17:06 2019/4/16
 */
public class DeliveryShipmentResult {
    private FlipKartShipmentResult[] shipments;
    private String error;
    private String error_description;
    private String message;
    private FlipKartErrorInfo[] errors;

    public DeliveryShipmentResult() {
    }

    public FlipKartShipmentResult[] getShipments() {
        return shipments;
    }

    public void setShipments(FlipKartShipmentResult[] shipments) {
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
        return "DeliveryShipmentResult{" +
                "shipments=" + Arrays.toString(shipments) +
                ", error='" + error + '\'' +
                ", error_description='" + error_description + '\'' +
                ", message='" + message + '\'' +
                ", errors=" + Arrays.toString(errors) +
                '}';
    }
}