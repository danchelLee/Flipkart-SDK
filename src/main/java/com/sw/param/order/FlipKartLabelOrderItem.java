package com.sw.param.order;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 14:11 2019/4/13
 */
public class FlipKartLabelOrderItem {
    private String orderItemId;
    private String processingStatus;
    private String errorCode;
    private String errorMessage;

    public FlipKartLabelOrderItem() {
    }

    public String getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(String orderItemId) {
        this.orderItemId = orderItemId;
    }

    public String getProcessingStatus() {
        return processingStatus;
    }

    public void setProcessingStatus(String processingStatus) {
        this.processingStatus = processingStatus;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public String toString() {
        return "FlipKartLabelOrderItem{" +
                "orderItemId='" + orderItemId + '\'' +
                ", processingStatus='" + processingStatus + '\'' +
                ", errorCode='" + errorCode + '\'' +
                ", errorMessage='" + errorMessage + '\'' +
                '}';
    }
}
