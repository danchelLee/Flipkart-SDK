package com.sw.param.returns;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 14:05 2019/4/17
 */
public class FlipKartReturn {
    private String comments;
    private String serviceDate;
    private String returnId;
    private String serviceFulfilmentId;
    private String pickupDate;
    private String newPickupDate;

    public FlipKartReturn() {
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getServiceDate() {
        return serviceDate;
    }

    public void setServiceDate(String serviceDate) {
        this.serviceDate = serviceDate;
    }

    public String getReturnId() {
        return returnId;
    }

    public void setReturnId(String returnId) {
        this.returnId = returnId;
    }

    public String getServiceFulfilmentId() {
        return serviceFulfilmentId;
    }

    public void setServiceFulfilmentId(String serviceFulfilmentId) {
        this.serviceFulfilmentId = serviceFulfilmentId;
    }

    public String getPickupDate() {
        return pickupDate;
    }

    public void setPickupDate(String pickupDate) {
        this.pickupDate = pickupDate;
    }

    public String getNewPickupDate() {
        return newPickupDate;
    }

    public void setNewPickupDate(String newPickupDate) {
        this.newPickupDate = newPickupDate;
    }

    @Override
    public String toString() {
        return "FlipKartReturn{" +
                "comments='" + comments + '\'' +
                ", serviceDate='" + serviceDate + '\'' +
                ", returnId='" + returnId + '\'' +
                ", serviceFulfilmentId='" + serviceFulfilmentId + '\'' +
                ", pickupDate='" + pickupDate + '\'' +
                ", newPickupDate='" + newPickupDate + '\'' +
                '}';
    }
}
