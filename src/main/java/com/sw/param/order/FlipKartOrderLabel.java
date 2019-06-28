package com.sw.param.order;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 11:13 2019/4/13
 */
public class FlipKartOrderLabel {
    private String orderItemId;
    private BigDecimal taxRate;
    private List<String> serialNumbers;
    private String invoiceNumber;
    private String invoiceDate;
    private List<FlipKartOrderLabel> subItems;

    public FlipKartOrderLabel() {
    }

    public String getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(String orderItemId) {
        this.orderItemId = orderItemId;
    }

    public BigDecimal getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(BigDecimal taxRate) {
        this.taxRate = taxRate;
    }

    public List<String> getSerialNumbers() {
        return serialNumbers;
    }

    public void setSerialNumbers(List<String> serialNumbers) {
        this.serialNumbers = serialNumbers;
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

    public List<FlipKartOrderLabel> getSubItems() {
        return subItems;
    }

    public void setSubItems(List<FlipKartOrderLabel> subItems) {
        this.subItems = subItems;
    }

    @Override
    public String toString() {
        return "FlipKartOrderLabel{" +
                "orderItemId='" + orderItemId + '\'' +
                ", taxRate=" + taxRate +
                ", serialNumbers=" + serialNumbers +
                ", invoiceNumber='" + invoiceNumber + '\'' +
                ", invoiceDate='" + invoiceDate + '\'' +
                ", subItems=" + subItems +
                '}';
    }
}
