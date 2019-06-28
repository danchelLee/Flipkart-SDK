package com.sw.param.shipment;

import java.math.BigDecimal;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 15:52 2019/4/15
 */
public class FlipKartTaxItem {
    private BigDecimal taxRate;
    private BigDecimal quantity;
    private String orderItemId;

    public FlipKartTaxItem() {
    }

    public BigDecimal getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(BigDecimal taxRate) {
        this.taxRate = taxRate;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public String getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(String orderItemId) {
        this.orderItemId = orderItemId;
    }

    @Override
    public String toString() {
        return "FlipKartTaxItem{" +
                "taxRate=" + taxRate +
                ", quantity=" + quantity +
                ", orderItemId='" + orderItemId + '\'' +
                '}';
    }
}
