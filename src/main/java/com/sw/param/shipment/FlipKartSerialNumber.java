package com.sw.param.shipment;

import java.util.Arrays;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 16:12 2019/4/15
 */
public class FlipKartSerialNumber {
    private String orderItemId;
    private String[] serialNumbers;

    public FlipKartSerialNumber() {
    }

    public String getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(String orderItemId) {
        this.orderItemId = orderItemId;
    }

    public String[] getSerialNumbers() {
        return serialNumbers;
    }

    public void setSerialNumbers(String[] serialNumbers) {
        this.serialNumbers = serialNumbers;
    }

    @Override
    public String toString() {
        return "FlipKartSerialNumber{" +
                "orderItemId='" + orderItemId + '\'' +
                ", serialNumbers=" + Arrays.toString(serialNumbers) +
                '}';
    }
}
