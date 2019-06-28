package com.sw.param.returns;

import com.sw.param.listing.FlipKartErrorInfo;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 15:27 2019/4/17
 */
public class RejectReturnResult {
    private List<FlipKartReturnReturn> returns;
    private String error;
    private String error_description;
    private String message;
    private FlipKartErrorInfo[] errors;

    public RejectReturnResult() {
    }

    public List<FlipKartReturnReturn> getReturns() {
        return returns;
    }

    public void setReturns(List<FlipKartReturnReturn> returns) {
        this.returns = returns;
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
        return "RejectReturnResult{" +
                "returns=" + returns +
                ", error='" + error + '\'' +
                ", error_description='" + error_description + '\'' +
                ", message='" + message + '\'' +
                ", errors=" + Arrays.toString(errors) +
                '}';
    }
}
