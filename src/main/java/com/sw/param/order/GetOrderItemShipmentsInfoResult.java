package com.sw.param.order;

import com.sw.param.listing.FlipKartErrorInfo;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 16:04 2019/6/14
 */
public class GetOrderItemShipmentsInfoResult {
    private FlipKartErrorInfo[] errors;

    private List<FlipkartOrderItemShipment> shipments;

    public GetOrderItemShipmentsInfoResult() {
    }

    public FlipKartErrorInfo[] getErrors() {
        return errors;
    }

    public void setErrors(FlipKartErrorInfo[] errors) {
        this.errors = errors;
    }

    public List<FlipkartOrderItemShipment> getShipments() {
        return shipments;
    }

    public void setShipments(List<FlipkartOrderItemShipment> shipments) {
        this.shipments = shipments;
    }

    @Override
    public String toString() {
        return "GetOrderItemShipmentsInfoResult{" +
                "errors=" + Arrays.toString(errors) +
                ", shipments=" + shipments +
                '}';
    }
}
