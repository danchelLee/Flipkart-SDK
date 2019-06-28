package com.sw.param.listing;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 16:00 2019/4/9
 */
public class CreateListingResult {

    private FlipKartSKUResult sku;

    public CreateListingResult() {
    }

    public FlipKartSKUResult getSku() {
        return sku;
    }

    public void setSku(FlipKartSKUResult sku) {
        this.sku = sku;
    }

    @Override
    public String toString() {
        return "CreateListingResult{" +
                "sku=" + sku +
                '}';
    }
}
