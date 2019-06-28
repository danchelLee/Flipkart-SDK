package com.sw.param.shipment;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 13:52 2019/4/16
 */
public class FlipKartDetail {
    /**
     * 供应商名称从母集中运送客户
     */
    private String vendorName;

    /**
     * 交货跟踪ID
     */
    private String trackingId;

    public FlipKartDetail() {
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getTrackingId() {
        return trackingId;
    }

    public void setTrackingId(String trackingId) {
        this.trackingId = trackingId;
    }

    @Override
    public String toString() {
        return "FlipKartDetail{" +
                "vendorName='" + vendorName + '\'' +
                ", trackingId='" + trackingId + '\'' +
                '}';
    }
}
