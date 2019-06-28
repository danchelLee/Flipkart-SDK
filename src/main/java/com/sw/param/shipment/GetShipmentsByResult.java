package com.sw.param.shipment;

import com.sw.param.listing.FlipKartErrorInfo;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 14:45 2019/4/15
 */
public class GetShipmentsByResult {
    private FlipKartErrorInfo error;
    private String message;
    private FlipKartErrorInfo[] errors;
    /**
     * 发货的集合
     */
    private List<FlipKartShipment> shipments;

    public GetShipmentsByResult() {
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

    public List<FlipKartShipment> getShipments() {
        return shipments;
    }

    public void setShipments(List<FlipKartShipment> shipments) {
        this.shipments = shipments;
    }

    @Override
    public String toString() {
        return "GetShipmentsByResult{" +
                "error=" + error +
                ", message='" + message + '\'' +
                ", errors=" + Arrays.toString(errors) +
                ", shipments=" + shipments +
                '}';
    }
}
