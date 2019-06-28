package com.sw.param.listing;

import java.util.Arrays;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 17:13 2019/4/9
 */
public class FlipKartSKUResult {
    private String status;
    private FlipKartErrorInfo[] errors;
    private FlipKartErrorInfo[] attribute_errors;

    public FlipKartSKUResult() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public FlipKartErrorInfo[] getErrors() {
        return errors;
    }

    public void setErrors(FlipKartErrorInfo[] errors) {
        this.errors = errors;
    }

    public FlipKartErrorInfo[] getAttribute_errors() {
        return attribute_errors;
    }

    public void setAttribute_errors(FlipKartErrorInfo[] attribute_errors) {
        this.attribute_errors = attribute_errors;
    }

    @Override
    public String toString() {
        return "FlipKartSKUResult{" +
                "status='" + status + '\'' +
                ", errors=" + Arrays.toString(errors) +
                ", attribute_errors=" + Arrays.toString(attribute_errors) +
                '}';
    }
}
