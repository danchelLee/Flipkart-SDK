package com.sw.param.shipment;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 11:26 2019/4/16
 */
public class FlipKartShipmentDispatch {
    private String status;
    private String errorCode;
    private String errorMessage;
    private String shipmentId;

    public FlipKartShipmentDispatch() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public String getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
    }

    @Override
    public String toString() {
        return "FlipKartShipmentDispatch{" +
                "status='" + status + '\'' +
                ", errorCode='" + errorCode + '\'' +
                ", errorMessage='" + errorMessage + '\'' +
                ", shipmentId='" + shipmentId + '\'' +
                '}';
    }
}
