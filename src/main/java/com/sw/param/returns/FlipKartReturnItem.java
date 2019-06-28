package com.sw.param.returns;

import java.math.BigDecimal;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 14:28 2019/4/17
 */
public class FlipKartReturnItem {
    private String reason;
    private BigDecimal quantity;
    private String comments;
    private String orderId;
    private String orderItemId;
    private String updatedDate;
    private String type;
    private String subReason;
    private String courierName;
    private String createdDate;
    private String sellerId;
    private String shipmentId;
    private BigDecimal returnId;
    private String orderDate;
    private String status;
    private String trackingId;
    private String expectedDate;
    private String shipmentStatus;

    public FlipKartReturnItem() {
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(String orderItemId) {
        this.orderItemId = orderItemId;
    }

    public String getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(String updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSubReason() {
        return subReason;
    }

    public void setSubReason(String subReason) {
        this.subReason = subReason;
    }

    public String getCourierName() {
        return courierName;
    }

    public void setCourierName(String courierName) {
        this.courierName = courierName;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public String getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
    }

    public BigDecimal getReturnId() {
        return returnId;
    }

    public void setReturnId(BigDecimal returnId) {
        this.returnId = returnId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTrackingId() {
        return trackingId;
    }

    public void setTrackingId(String trackingId) {
        this.trackingId = trackingId;
    }

    public String getExpectedDate() {
        return expectedDate;
    }

    public void setExpectedDate(String expectedDate) {
        this.expectedDate = expectedDate;
    }

    public String getShipmentStatus() {
        return shipmentStatus;
    }

    public void setShipmentStatus(String shipmentStatus) {
        this.shipmentStatus = shipmentStatus;
    }

    @Override
    public String toString() {
        return "FlipKartReturnItem{" +
                "reason='" + reason + '\'' +
                ", quantity=" + quantity +
                ", comments='" + comments + '\'' +
                ", orderId='" + orderId + '\'' +
                ", orderItemId='" + orderItemId + '\'' +
                ", updatedDate='" + updatedDate + '\'' +
                ", type='" + type + '\'' +
                ", subReason='" + subReason + '\'' +
                ", courierName='" + courierName + '\'' +
                ", createdDate='" + createdDate + '\'' +
                ", sellerId='" + sellerId + '\'' +
                ", shipmentId='" + shipmentId + '\'' +
                ", returnId=" + returnId +
                ", orderDate='" + orderDate + '\'' +
                ", status='" + status + '\'' +
                ", trackingId='" + trackingId + '\'' +
                ", expectedDate='" + expectedDate + '\'' +
                ", shipmentStatus='" + shipmentStatus + '\'' +
                '}';
    }
}
