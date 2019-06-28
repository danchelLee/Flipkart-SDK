package com.sw.param.order;

import java.math.BigDecimal;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 14:28 2019/4/12
 */
public class FlipKartPriceComponent {
    /**
     * 产品价格由卖家列出。该值可以小于或等于MRP。
     */
    private BigDecimal sellingPrice;
    /**
     * 客户为此订单商品支付的价格(customerPrice``+ ``shippingCharge)
     */
    private BigDecimal totalPrice;
    /**
     * 此订单项目的运费已收取费用。
     */
    private BigDecimal shippingCharge;
    /**
     * 买方从网站购买订单商品的价格（sellingPrice- promotionDiscount）
     */
    private BigDecimal customerPrice;
    /**
     * 特定订单商品ID的EMI组件
     */
    private BigDecimal emi;
    /**
     * 特定订单商品ID的Flipkart折扣
     */
    private BigDecimal flipkartDiscount;

    public FlipKartPriceComponent() {
    }

    public FlipKartPriceComponent(BigDecimal sellingPrice, BigDecimal totalPrice, BigDecimal shippingCharge, BigDecimal customerPrice, BigDecimal emi, BigDecimal flipkartDiscount) {
        this.sellingPrice = sellingPrice;
        this.totalPrice = totalPrice;
        this.shippingCharge = shippingCharge;
        this.customerPrice = customerPrice;
        this.emi = emi;
        this.flipkartDiscount = flipkartDiscount;
    }

    public BigDecimal getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(BigDecimal sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public BigDecimal getShippingCharge() {
        return shippingCharge;
    }

    public void setShippingCharge(BigDecimal shippingCharge) {
        this.shippingCharge = shippingCharge;
    }

    public BigDecimal getCustomerPrice() {
        return customerPrice;
    }

    public void setCustomerPrice(BigDecimal customerPrice) {
        this.customerPrice = customerPrice;
    }

    public BigDecimal getEmi() {
        return emi;
    }

    public void setEmi(BigDecimal emi) {
        this.emi = emi;
    }

    public BigDecimal getFlipkartDiscount() {
        return flipkartDiscount;
    }

    public void setFlipkartDiscount(BigDecimal flipkartDiscount) {
        this.flipkartDiscount = flipkartDiscount;
    }

    @Override
    public String toString() {
        return "FlipKartPriceComponent{" +
                "sellingPrice=" + sellingPrice +
                ", totalPrice=" + totalPrice +
                ", shippingCharge=" + shippingCharge +
                ", customerPrice=" + customerPrice +
                ", emi=" + emi +
                ", flipkartDiscount=" + flipkartDiscount +
                '}';
    }
}
