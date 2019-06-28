package com.sw.param.order;

import java.math.BigDecimal;

/**
 * @Author: Dc Lee
 * @Descpription: ``vendorGroupCode``是必填字段。
 * 如果``mps``为真，则提取日期也是强制性的
 * @Date: 16:40 2019/4/16
 */
public class FlipKartShipmentManifest {
    private FlipKartDate pickUpDate;
    /**
     * 货件属于Multi pack货件
     */
    private Boolean isMps;
    /**
     * 可分发货件所属的供应商代码
     */
    private String vendorGroupCode;
    /**
     * 该供应商的可分发货件数量
     */
    private BigDecimal count;

    public FlipKartShipmentManifest() {
    }

    public FlipKartDate getPickUpDate() {
        return pickUpDate;
    }

    public void setPickUpDate(FlipKartDate pickUpDate) {
        this.pickUpDate = pickUpDate;
    }

    public Boolean getMps() {
        return isMps;
    }

    public void setMps(Boolean mps) {
        isMps = mps;
    }

    public String getVendorGroupCode() {
        return vendorGroupCode;
    }

    public void setVendorGroupCode(String vendorGroupCode) {
        this.vendorGroupCode = vendorGroupCode;
    }

    public BigDecimal getCount() {
        return count;
    }

    public void setCount(BigDecimal count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "FlipKartShipmentManifest{" +
                "pickUpDate=" + pickUpDate +
                ", isMps=" + isMps +
                ", vendorGroupCode='" + vendorGroupCode + '\'' +
                ", count=" + count +
                '}';
    }
}
