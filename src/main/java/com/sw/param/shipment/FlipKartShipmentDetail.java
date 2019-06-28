package com.sw.param.shipment;

import com.sw.param.order.FlipKartSubShipment;

import java.util.Arrays;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 11:58 2019/4/16
 */
public class FlipKartShipmentDetail {
    private String orderId;
    private FlipKartAddress deliveryAddress;
    private String shipmentId;
    private String locationId;
    private FlipKartShipmentDetailOrderItem[] orderItems;
    private FlipKartAddress sellerAddress;
    private FlipKartAddress billingAddress;
    private FlipKartBuyerDetail buyerDetails;
    private FlipKartSubShipment[] subShipments;
    private FlipKartAddress returnAddress;

    public FlipKartShipmentDetail() {
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public FlipKartAddress getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(FlipKartAddress deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public String getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public FlipKartShipmentDetailOrderItem[] getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(FlipKartShipmentDetailOrderItem[] orderItems) {
        this.orderItems = orderItems;
    }

    public FlipKartAddress getSellerAddress() {
        return sellerAddress;
    }

    public void setSellerAddress(FlipKartAddress sellerAddress) {
        this.sellerAddress = sellerAddress;
    }

    public FlipKartAddress getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(FlipKartAddress billingAddress) {
        this.billingAddress = billingAddress;
    }

    public FlipKartBuyerDetail getBuyerDetails() {
        return buyerDetails;
    }

    public void setBuyerDetails(FlipKartBuyerDetail buyerDetails) {
        this.buyerDetails = buyerDetails;
    }

    public FlipKartSubShipment[] getSubShipments() {
        return subShipments;
    }

    public void setSubShipments(FlipKartSubShipment[] subShipments) {
        this.subShipments = subShipments;
    }

    public FlipKartAddress getReturnAddress() {
        return returnAddress;
    }

    public void setReturnAddress(FlipKartAddress returnAddress) {
        this.returnAddress = returnAddress;
    }

    @Override
    public String toString() {
        return "FlipKartShipmentDetail{" +
                "orderId='" + orderId + '\'' +
                ", deliveryAddress=" + deliveryAddress +
                ", shipmentId='" + shipmentId + '\'' +
                ", locationId='" + locationId + '\'' +
                ", orderItems=" + Arrays.toString(orderItems) +
                ", sellerAddress=" + sellerAddress +
                ", billingAddress=" + billingAddress +
                ", buyerDetails=" + buyerDetails +
                ", subShipments=" + Arrays.toString(subShipments) +
                ", returnAddress=" + returnAddress +
                '}';
    }
}
