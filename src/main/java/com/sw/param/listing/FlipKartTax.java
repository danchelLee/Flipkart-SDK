package com.sw.param.listing;

import java.math.BigDecimal;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 11:51 2019/4/8
 */
public class FlipKartTax {
    /**
     * 用于确定适用税率的产品的协调系统命名
     */
    private String hsn;

    /**
     * Flipkart的税法代码决定了上市的商品和服务税。
     * 每个tax_code内部映射到商品服务税（GST）。
     * 例如，tax_code GST_0映射到0％税，GST_APPAREL根据最终购物车价值映射到服装GST。
     * MyListings页面上提供了所有税码。
     */
    private String tax_code;

    private BigDecimal luxury_cess_percentage;

    public FlipKartTax() {
    }

    public FlipKartTax(String hsn, String tax_code) {
        this.hsn = hsn;
        this.tax_code = tax_code;
    }

    public String getHsn() {
        return hsn;
    }

    public void setHsn(String hsn) {
        this.hsn = hsn;
    }

    public String getTax_code() {
        return tax_code;
    }

    public void setTax_code(String tax_code) {
        this.tax_code = tax_code;
    }

    public BigDecimal getLuxury_cess_percentage() {
        return luxury_cess_percentage;
    }

    public void setLuxury_cess_percentage(BigDecimal luxury_cess_percentage) {
        this.luxury_cess_percentage = luxury_cess_percentage;
    }

    @Override
    public String toString() {
        return "FlipKartTax{" +
                "hsn='" + hsn + '\'' +
                ", tax_code='" + tax_code + '\'' +
                ", luxury_cess_percentage=" + luxury_cess_percentage +
                '}';
    }
}
