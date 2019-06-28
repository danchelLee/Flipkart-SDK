package com.sw.param.order;

import java.math.BigDecimal;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 9:40 2019/4/16
 */
public class FlipKartTaxDetail {
    private BigDecimal cgstRate;
    private BigDecimal sgstRate;
    private BigDecimal igstRate;

    public FlipKartTaxDetail() {
    }

    public BigDecimal getCgstRate() {
        return cgstRate;
    }

    public void setCgstRate(BigDecimal cgstRate) {
        this.cgstRate = cgstRate;
    }

    public BigDecimal getSgstRate() {
        return sgstRate;
    }

    public void setSgstRate(BigDecimal sgstRate) {
        this.sgstRate = sgstRate;
    }

    public BigDecimal getIgstRate() {
        return igstRate;
    }

    public void setIgstRate(BigDecimal igstRate) {
        this.igstRate = igstRate;
    }

    @Override
    public String toString() {
        return "FlipKartTaxDetail{" +
                "cgstRate=" + cgstRate +
                ", sgstRate=" + sgstRate +
                ", igstRate=" + igstRate +
                '}';
    }
}
