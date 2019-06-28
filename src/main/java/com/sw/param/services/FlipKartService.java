package com.sw.param.services;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 10:26 2019/4/17
 */
public class FlipKartService {

    private String subReason;
    private String reason;
    private String comments;
    private String newDeliveryDate;
    private String serviceFulfilmentId;
    private String deliveryDate;

    public FlipKartService() {
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

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getNewDeliveryDate() {
        return newDeliveryDate;
    }

    public void setNewDeliveryDate(String newDeliveryDate) {
        this.newDeliveryDate = newDeliveryDate;
    }

    public String getServiceFulfilmentId() {
        return serviceFulfilmentId;
    }

    public void setServiceFulfilmentId(String serviceFulfilmentId) {
        this.serviceFulfilmentId = serviceFulfilmentId;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String toString() {
        return "FlipKartService{" +
                "subReason='" + subReason + '\'' +
                ", reason='" + reason + '\'' +
                ", comments='" + comments + '\'' +
                ", newDeliveryDate='" + newDeliveryDate + '\'' +
                ", serviceFulfilmentId='" + serviceFulfilmentId + '\'' +
                ", deliveryDate='" + deliveryDate + '\'' +
                '}';
    }
}
