package com.sw.param.order;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 17:00 2019/4/29
 */
public class FlipKartCancelOrderItem {
    private String orderItemId;
    private CancelOrderParam.FlipKartCancelReason reason;

    public FlipKartCancelOrderItem() {
    }

    public FlipKartCancelOrderItem(String orderItemId, CancelOrderParam.FlipKartCancelReason reason) {
        this.orderItemId = orderItemId;
        this.reason = reason;
    }

    public String getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(String orderItemId) {
        this.orderItemId = orderItemId;
    }

    public CancelOrderParam.FlipKartCancelReason getReason() {
        return reason;
    }

    public void setReason(CancelOrderParam.FlipKartCancelReason reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "FlipKartCancelOrderItem{" +
                "orderItemId='" + orderItemId + '\'' +
                ", reason=" + reason +
                '}';
    }
}
