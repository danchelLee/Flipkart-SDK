package com.sw.param.shipment;

import com.sw.param.order.*;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 14:54 2019/4/15
 */
public class FlipKartShipment {
    private Boolean mps;
    /**
     * 特定货件的主要标识符。
     */
    private String shipmentId;
    /**
     * Id指的是卖方的派遣地点
     */
    private String locationId;
    /**
     * 卖方需要发送订单商品的日期
     */
    private String dispatchByDate;
    private List<FlipKartOrderItem> orderItems;
    /**
     * 卖方需要处理订单商品的日期
     */
    private String dispatchAfterDate;
    /**
     * 与货件关联的子货件清单
     */
    private List<FlipKartSubShipment> subShipments;
    /**
     * 与货件相关的表格列表
     */
    private List<FlipKartForm> forms;
    /**
     * 特定订单商品的上次更新的时间戳
     */
    private String updatedAt;
    /**
     * 标记True或False用于装运验证过程。
     */
    private Boolean hold;

    private List<FlipKartTaxItem> taxItems;

    private List<FlipKartInvoice> invoice;

    private List<FlipKartSerialNumber> serialNumbers;

    private CancelOrderParam.FlipKartCancelReason reason;

    private List<String> cancellationGroupIds;

    private String deliveryDate;

    private FlipKartFailureAttribute failureAttributes;

    private String tentativeDeliveryDate;

    private String deliveryPartner;

    private String trackingId;

    public FlipKartShipment() {
    }

    public Boolean getMps() {
        return mps;
    }

    public void setMps(Boolean mps) {
        this.mps = mps;
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

    public String getDispatchByDate() {
        return dispatchByDate;
    }

    public void setDispatchByDate(String dispatchByDate) {
        this.dispatchByDate = dispatchByDate;
    }

    public List<FlipKartOrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<FlipKartOrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public String getDispatchAfterDate() {
        return dispatchAfterDate;
    }

    public void setDispatchAfterDate(String dispatchAfterDate) {
        this.dispatchAfterDate = dispatchAfterDate;
    }

    public List<FlipKartSubShipment> getSubShipments() {
        return subShipments;
    }

    public void setSubShipments(List<FlipKartSubShipment> subShipments) {
        this.subShipments = subShipments;
    }

    public List<FlipKartForm> getForms() {
        return forms;
    }

    public void setForms(List<FlipKartForm> forms) {
        this.forms = forms;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Boolean getHold() {
        return hold;
    }

    public void setHold(Boolean hold) {
        this.hold = hold;
    }

    public List<FlipKartTaxItem> getTaxItems() {
        return taxItems;
    }

    public void setTaxItems(List<FlipKartTaxItem> taxItems) {
        this.taxItems = taxItems;
    }

    public List<FlipKartInvoice> getInvoice() {
        return invoice;
    }

    public void setInvoice(List<FlipKartInvoice> invoice) {
        this.invoice = invoice;
    }

    public List<FlipKartSerialNumber> getSerialNumbers() {
        return serialNumbers;
    }

    public void setSerialNumbers(List<FlipKartSerialNumber> serialNumbers) {
        this.serialNumbers = serialNumbers;
    }

    public CancelOrderParam.FlipKartCancelReason getReason() {
        return reason;
    }

    public void setReason(CancelOrderParam.FlipKartCancelReason reason) {
        this.reason = reason;
    }

    public List<String> getCancellationGroupIds() {
        return cancellationGroupIds;
    }

    public void setCancellationGroupIds(List<String> cancellationGroupIds) {
        this.cancellationGroupIds = cancellationGroupIds;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public FlipKartFailureAttribute getFailureAttributes() {
        return failureAttributes;
    }

    public void setFailureAttributes(FlipKartFailureAttribute failureAttributes) {
        this.failureAttributes = failureAttributes;
    }

    public String getTentativeDeliveryDate() {
        return tentativeDeliveryDate;
    }

    public void setTentativeDeliveryDate(String tentativeDeliveryDate) {
        this.tentativeDeliveryDate = tentativeDeliveryDate;
    }

    public String getDeliveryPartner() {
        return deliveryPartner;
    }

    public void setDeliveryPartner(String deliveryPartner) {
        this.deliveryPartner = deliveryPartner;
    }

    public String getTrackingId() {
        return trackingId;
    }

    public void setTrackingId(String trackingId) {
        this.trackingId = trackingId;
    }

    @Override
    public String toString() {
        return "FlipKartShipment{" +
                "mps=" + mps +
                ", shipmentId='" + shipmentId + '\'' +
                ", locationId='" + locationId + '\'' +
                ", dispatchByDate='" + dispatchByDate + '\'' +
                ", orderItems=" + orderItems +
                ", dispatchAfterDate='" + dispatchAfterDate + '\'' +
                ", subShipments=" + subShipments +
                ", forms=" + forms +
                ", updatedAt='" + updatedAt + '\'' +
                ", hold=" + hold +
                ", taxItems=" + taxItems +
                ", invoice=" + invoice +
                ", serialNumbers=" + serialNumbers +
                ", reason=" + reason +
                ", cancellationGroupIds=" + cancellationGroupIds +
                ", deliveryDate='" + deliveryDate + '\'' +
                ", failureAttributes=" + failureAttributes +
                ", tentativeDeliveryDate='" + tentativeDeliveryDate + '\'' +
                ", deliveryPartner='" + deliveryPartner + '\'' +
                ", trackingId='" + trackingId + '\'' +
                '}';
    }
}
