package com.sw.param.listing;

import java.util.Arrays;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 14:31 2019/4/10
 */
public class UpdateListingInventoryResult {

    private FlipKartSKUResult sku;
    private String status;
    private FlipKartErrorInfo[] attribute_errors;

    public UpdateListingInventoryResult() {
    }

    public FlipKartSKUResult getSku() {
        return sku;
    }

    public void setSku(FlipKartSKUResult sku) {
        this.sku = sku;
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
        return "UpdateListingInventoryResult{" +
                "sku=" + sku +
                ", status='" + status + '\'' +
                ", attribute_errors=" + Arrays.toString(attribute_errors) +
                '}';
    }
}
