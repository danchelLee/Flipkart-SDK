package com.sw.param.order;

import com.sw.param.shipment.FlipKartAddress;
import com.sw.param.shipment.FlipKartBuyerDetail;
import com.sw.param.shipment.FlipKartCourierDetail;

import java.util.List;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 16:44 2019/6/14
 */
public class FlipkartOrderItemShipment {

    private String orderId;

    private FlipKartAddress deliveryAddress;

    private String shipmentId;

    private FlipKartCourierDetail courierDetails;

    private FlipKartAddress sellerAddress;

    private FlipKartAddress billingAddress;

    private FlipKartBuyerDetail buyerDetails;

    private Boolean weighingRequired;

    private FlipKartAddress returnAddress;

    private List<FlipKartOrderItem> orderItems;

    public FlipkartOrderItemShipment() {
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

    public FlipKartCourierDetail getCourierDetails() {
        return courierDetails;
    }

    public void setCourierDetails(FlipKartCourierDetail courierDetails) {
        this.courierDetails = courierDetails;
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

    public Boolean getWeighingRequired() {
        return weighingRequired;
    }

    public void setWeighingRequired(Boolean weighingRequired) {
        this.weighingRequired = weighingRequired;
    }

    public FlipKartAddress getReturnAddress() {
        return returnAddress;
    }

    public void setReturnAddress(FlipKartAddress returnAddress) {
        this.returnAddress = returnAddress;
    }

    public List<FlipKartOrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<FlipKartOrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    @Override
    public String toString() {
        return "FlipkartOrderItemShipment{" +
                "orderId='" + orderId + '\'' +
                ", deliveryAddress=" + deliveryAddress +
                ", shipmentId='" + shipmentId + '\'' +
                ", courierDetails=" + courierDetails +
                ", sellerAddress=" + sellerAddress +
                ", billingAddress=" + billingAddress +
                ", buyerDetails=" + buyerDetails +
                ", weighingRequired=" + weighingRequired +
                ", returnAddress=" + returnAddress +
                ", orderItems=" + orderItems +
                '}';
    }
}
