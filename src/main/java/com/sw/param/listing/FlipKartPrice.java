package com.sw.param.listing;

import java.math.BigDecimal;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 11:38 2019/4/8
 */
public class FlipKartPrice {
    /**
     * 产品最高的零售价
     */
    private BigDecimal mrp;
    /**
     * 卖家对产品的销售价格
     */
    private BigDecimal selling_price;
    /**
     * 货币单位
     */
    private String currency;

    public FlipKartPrice() {
    }

    public FlipKartPrice(BigDecimal mrp, BigDecimal selling_price) {
        this.mrp = mrp;
        this.selling_price = selling_price;
    }

    public FlipKartPrice(BigDecimal mrp, BigDecimal selling_price, String currency) {
        this.mrp = mrp;
        this.selling_price = selling_price;
        this.currency = currency;
    }

    public BigDecimal getMrp() {
        return mrp;
    }

    public void setMrp(BigDecimal mrp) {
        this.mrp = mrp;
    }

    public BigDecimal getSelling_price() {
        return selling_price;
    }

    public void setSelling_price(BigDecimal selling_price) {
        this.selling_price = selling_price;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "FlipKartPrice{" +
                "mrp=" + mrp +
                ", selling_price=" + selling_price +
                ", currency='" + currency + '\'' +
                '}';
    }

}
