package com.sw.param.shipment;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 12:02 2019/4/16
 */
public class FlipKartShipmentDetailOrderItem {
    /**
     * 表明装运是否很大
     */
    private Boolean large;
    /**
     * 表明装运是否是危险的
     */
    private Boolean dangerous;
    /**
     * 订单商品ID
     */
    private String id;
    /**
     * 是否是易碎的
     */
    private Boolean fragile;

    public FlipKartShipmentDetailOrderItem() {
    }

    public Boolean getLarge() {
        return large;
    }

    public void setLarge(Boolean large) {
        this.large = large;
    }

    public Boolean getDangerous() {
        return dangerous;
    }

    public void setDangerous(Boolean dangerous) {
        this.dangerous = dangerous;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getFragile() {
        return fragile;
    }

    public void setFragile(Boolean fragile) {
        this.fragile = fragile;
    }

    @Override
    public String toString() {
        return "FlipKartShipmentDetailOrderItem{" +
                "large=" + large +
                ", dangerous=" + dangerous +
                ", id='" + id + '\'' +
                ", fragile=" + fragile +
                '}';
    }
}
