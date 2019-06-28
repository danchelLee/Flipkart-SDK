package com.sw.param.returns;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 14:08 2019/4/17
 */
public class FlipKartReturnReturn {
    private String returnId;
    private String errorMessage;
    private String errorCode;
    private String status;

    public FlipKartReturnReturn() {
    }

    public String getReturnId() {
        return returnId;
    }

    public void setReturnId(String returnId) {
        this.returnId = returnId;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "FlipKartReturnReturn{" +
                "returnId='" + returnId + '\'' +
                ", errorMessage='" + errorMessage + '\'' +
                ", errorCode='" + errorCode + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
