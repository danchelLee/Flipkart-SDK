package com.sw.param.listing;

import java.math.BigDecimal;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 11:56 2019/4/8
 */
public class FlipKartShippingFees {
    private BigDecimal local;
    private BigDecimal zonal;
    private BigDecimal national;
    private String currency;

    public FlipKartShippingFees() {
    }

    public FlipKartShippingFees(BigDecimal local, BigDecimal zonal, BigDecimal national) {
        this.local = local;
        this.zonal = zonal;
        this.national = national;
    }

    public FlipKartShippingFees(BigDecimal local, BigDecimal zonal) {
        this.local = local;
        this.zonal = zonal;
    }

    public FlipKartShippingFees(BigDecimal local, BigDecimal zonal, BigDecimal national, String currency) {
        this.local = local;
        this.zonal = zonal;
        this.national = national;
        this.currency = currency;
    }

    public BigDecimal getLocal() {
        return local;
    }

    public void setLocal(BigDecimal local) {
        this.local = local;
    }

    public BigDecimal getZonal() {
        return zonal;
    }

    public void setZonal(BigDecimal zonal) {
        this.zonal = zonal;
    }

    public BigDecimal getNational() {
        return national;
    }

    public void setNational(BigDecimal national) {
        this.national = national;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "FlipKartShippingFees{" +
                "local=" + local +
                ", zonal=" + zonal +
                ", national=" + national +
                ", currency='" + currency + '\'' +
                '}';
    }
}
