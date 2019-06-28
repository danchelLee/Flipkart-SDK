package com.sw.param.order;

import java.math.BigDecimal;
import java.util.Arrays;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 14:19 2019/4/15
 */
public class FlipKartInvoice {

    private String orderItemId;
    private String invoiceNumber;
    private String invoiceDate;
    private BigDecimal invoiceAmount;
    private BigDecimal taxRate;
    private String orderId;
    private String shipmentId;
    private FlipKartTaxDetailOrderItem[] orderItems;

    public FlipKartInvoice() {
    }

    public String getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(String orderItemId) {
        this.orderItemId = orderItemId;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public BigDecimal getInvoiceAmount() {
        return invoiceAmount;
    }

    public void setInvoiceAmount(BigDecimal invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
    }

    public BigDecimal getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(BigDecimal taxRate) {
        this.taxRate = taxRate;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
    }

    public FlipKartTaxDetailOrderItem[] getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(FlipKartTaxDetailOrderItem[] orderItems) {
        this.orderItems = orderItems;
    }

    @Override
    public String toString() {
        return "FlipKartInvoice{" +
                "orderItemId='" + orderItemId + '\'' +
                ", invoiceNumber='" + invoiceNumber + '\'' +
                ", invoiceDate='" + invoiceDate + '\'' +
                ", invoiceAmount=" + invoiceAmount +
                ", taxRate=" + taxRate +
                ", orderId='" + orderId + '\'' +
                ", shipmentId='" + shipmentId + '\'' +
                ", orderItems=" + Arrays.toString(orderItems) +
                '}';
    }
}
