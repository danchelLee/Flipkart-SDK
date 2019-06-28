package com.sw.param.listing;

import java.math.BigDecimal;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 15:21 2019/4/8
 */
public class FlipKartNotionalValue {
    /**
     * 价值的参数值
     */
    private BigDecimal amount;
    /**
     * 价值的单位
     */
    private String unit;

    public FlipKartNotionalValue() {
    }

    public FlipKartNotionalValue(BigDecimal amount, String unit) {
        this.amount = amount;
        this.unit = unit;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "FlipKartNotionalValue{" +
                "amount=" + amount +
                ", unit='" + unit + '\'' +
                '}';
    }
}
