package com.sw.param.shipment;

import com.sw.param.listing.FlipKartErrorInfo;

import java.util.Arrays;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 14:48 2019/4/16
 */
public class GetShipmentFormByShipmentIdResult {
    private FlipKartShipment[] shipments;
    private String error;
    private String error_description;
    private FlipKartErrorInfo[] errors;

    public GetShipmentFormByShipmentIdResult() {
    }

    public FlipKartShipment[] getShipments() {
        return shipments;
    }

    public void setShipments(FlipKartShipment[] shipments) {
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

    public FlipKartErrorInfo[] getErrors() {
        return errors;
    }

    public void setErrors(FlipKartErrorInfo[] errors) {
        this.errors = errors;
    }

    @Override
    public String toString() {
        return "GetShipmentFormByShipmentIdResult{" +
                "shipments=" + Arrays.toString(shipments) +
                ", error='" + error + '\'' +
                ", error_description='" + error_description + '\'' +
                ", errors=" + Arrays.toString(errors) +
                '}';
    }
}
