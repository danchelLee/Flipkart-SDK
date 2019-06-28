package com.sw.param.shipment;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 18:11 2019/4/16
 */
public class FlipKartFailureAttribute {
    private String subReason;
    private String reason;
    private String newDeliveryDate;

    public FlipKartFailureAttribute() {
    }

    public String getSubReason() {
        return subReason;
    }

    public void setSubReason(String subReason) {
        this.subReason = subReason;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getNewDeliveryDate() {
        return newDeliveryDate;
    }

    public void setNewDeliveryDate(String newDeliveryDate) {
        this.newDeliveryDate = newDeliveryDate;
    }


}
