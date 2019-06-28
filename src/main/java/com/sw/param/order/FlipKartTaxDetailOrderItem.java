package com.sw.param.order;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 9:39 2019/4/16
 */
public class FlipKartTaxDetailOrderItem {
    private BigDecimal taxRate;
    private FlipKartTaxDetail taxDetails;
    private String orderItemId;
    private List<String> serialNumbers;
    private BigDecimal invoiceAmount;

    public FlipKartTaxDetailOrderItem() {
    }

    public BigDecimal getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(BigDecimal taxRate) {
        this.taxRate = taxRate;
    }

    public FlipKartTaxDetail getTaxDetails() {
        return taxDetails;
    }

    public void setTaxDetails(FlipKartTaxDetail taxDetails) {
        this.taxDetails = taxDetails;
    }

    public String getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(String orderItemId) {
        this.orderItemId = orderItemId;
    }

    public List<String> getSerialNumbers() {
        return serialNumbers;
    }

    public void setSerialNumbers(List<String> serialNumbers) {
        this.serialNumbers = serialNumbers;
    }

    public BigDecimal getInvoiceAmount() {
        return invoiceAmount;
    }

    public void setInvoiceAmount(BigDecimal invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
    }

    @Override
    public String toString() {
        return "FlipKartTaxDetailOrderItem{" +
                "taxRate=" + taxRate +
                ", taxDetails=" + taxDetails +
                ", orderItemId='" + orderItemId + '\'' +
                ", serialNumbers=" + serialNumbers +
                ", invoiceAmount=" + invoiceAmount +
                '}';
    }
}
