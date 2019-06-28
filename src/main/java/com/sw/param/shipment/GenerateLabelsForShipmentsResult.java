package com.sw.param.shipment;

import com.sw.param.listing.FlipKartErrorInfo;

import java.util.Arrays;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 15:37 2019/4/15
 */
public class GenerateLabelsForShipmentsResult {
    private FlipKartErrorInfo error;
    private String message;
    private FlipKartErrorInfo[] errors;
    private String error_description;
    private FlipKartShipmentLabel[] shipments;

    public GenerateLabelsForShipmentsResult() {
    }

    public FlipKartErrorInfo getError() {
        return error;
    }

    public void setError(FlipKartErrorInfo error) {
        this.error = error;
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

    public FlipKartShipmentLabel[] getShipments() {
        return shipments;
    }

    public void setShipments(FlipKartShipmentLabel[] shipments) {
        this.shipments = shipments;
    }

    public String getError_description() {
        return error_description;
    }

    public void setError_description(String error_description) {
        this.error_description = error_description;
    }

    @Override
    public String toString() {
        return "GenerateLabelsForShipmentsResult{" +
                "error=" + error +
                ", message='" + message + '\'' +
                ", errors=" + Arrays.toString(errors) +
                ", error_description='" + error_description + '\'' +
                ", shipments=" + Arrays.toString(shipments) +
                '}';
    }
}
