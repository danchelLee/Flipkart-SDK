package com.sw.param.services;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 10:31 2019/4/17
 */
public class FlipKartServicesReturn {

    private String failureReason;

    private String serviceFulfilmentId;

    private String status;

    public FlipKartServicesReturn() {
    }

    public String getFailureReason() {
        return failureReason;
    }

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    public String getServiceFulfilmentId() {
        return serviceFulfilmentId;
    }

    public void setServiceFulfilmentId(String serviceFulfilmentId) {
        this.serviceFulfilmentId = serviceFulfilmentId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "FlipKartServicesReturn{" +
                "failureReason='" + failureReason + '\'' +
                ", serviceFulfilmentId='" + serviceFulfilmentId + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
