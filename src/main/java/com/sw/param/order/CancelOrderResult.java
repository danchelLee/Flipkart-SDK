package com.sw.param.order;

import java.util.List;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 13:39 2019/4/15
 */
public class CancelOrderResult {
    /**
     * {
     *   "cancelled": [
     *     null
     *   ],
     *   "failedCancellations": [
     *     {
     *       "orderItemId": "",
     *       "reason": ""
     *     }
     *   ]
     * }
     */
    private String type;
    private String code;
    private String message;
    private String status;
    private String error;
    private String error_description;
    private List<String> cancelled;
    private List<FlipKartCancelOrderItem> failedCancellations;

    public CancelOrderResult() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getError_description() {
        return error_description;
    }

    public void setError_description(String error_description) {
        this.error_description = error_description;
    }

    public List<String> getCancelled() {
        return cancelled;
    }

    public void setCancelled(List<String> cancelled) {
        this.cancelled = cancelled;
    }

    public List<FlipKartCancelOrderItem> getFailedCancellations() {
        return failedCancellations;
    }

    public void setFailedCancellations(List<FlipKartCancelOrderItem> failedCancellations) {
        this.failedCancellations = failedCancellations;
    }

    @Override
    public String toString() {
        return "CancelOrderResult{" +
                "type='" + type + '\'' +
                ", code='" + code + '\'' +
                ", message='" + message + '\'' +
                ", status='" + status + '\'' +
                ", error='" + error + '\'' +
                ", error_description='" + error_description + '\'' +
                ", cancelled=" + cancelled +
                ", failedCancellations=" + failedCancellations +
                '}';
    }
}
