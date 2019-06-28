package com.sw.param.returns;

import com.sw.param.listing.FlipKartErrorInfo;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 14:33 2019/4/17
 */
public class GetReturnsResult {
    private List<FlipKartReturnItem> returnItems;
    private String error;
    private String error_description;
    private String message;
    private FlipKartErrorInfo[] errors;

    public GetReturnsResult() {
    }

    public List<FlipKartReturnItem> getReturnItems() {
        return returnItems;
    }

    public void setReturnItems(List<FlipKartReturnItem> returnItems) {
        this.returnItems = returnItems;
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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public FlipKartErrorInfo[] getErrors() {
        return errors;
    }

    public void setErrors(FlipKartErrorInfo[] errors) {
        this.errors = errors;
    }

    @Override
    public String toString() {
        return "GetReturnsResult{" +
                "returnItems=" + returnItems +
                ", error='" + error + '\'' +
                ", error_description='" + error_description + '\'' +
                ", message='" + message + '\'' +
                ", errors=" + Arrays.toString(errors) +
                '}';
    }
}
