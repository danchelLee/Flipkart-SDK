package com.sw.param.listing;

import java.util.Arrays;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 14:03 2019/4/10
 */
public class UpdateProductListingsResult {

    private FlipKartSKUResult sku;

    private FlipKartErrorInfo[] errors;

    private FlipKartErrorInfo[] attribute_errors;

    private String status;

    public UpdateProductListingsResult() {
    }

    public FlipKartSKUResult getSku() {
        return sku;
    }

    public void setSku(FlipKartSKUResult sku) {
        this.sku = sku;
    }

    public FlipKartErrorInfo[] getErrors() {
        return errors;
    }

    public void setErrors(FlipKartErrorInfo[] errors) {
        this.errors = errors;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public FlipKartErrorInfo[] getAttribute_errors() {
        return attribute_errors;
    }

    public void setAttribute_errors(FlipKartErrorInfo[] attribute_errors) {
        this.attribute_errors = attribute_errors;
    }

    @Override
    public String toString() {
        return "UpdateProductListingsResult{" +
                "sku=" + sku +
                ", errors=" + Arrays.toString(errors) +
                ", attribute_errors=" + Arrays.toString(attribute_errors) +
                ", status='" + status + '\'' +
                '}';
    }
}
