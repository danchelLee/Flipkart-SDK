package com.sw.param.listing;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 15:20 2019/4/8
 */
public class FlipKartHandling {
    /**
     * 包含易碎产品。
     */
    private Boolean fragile;

    public FlipKartHandling() {
    }

    public FlipKartHandling(Boolean fragile) {
        this.fragile = fragile;
    }

    public Boolean getFragile() {
        return fragile;
    }

    public void setFragile(Boolean fragile) {
        this.fragile = fragile;
    }

    @Override
    public String toString() {
        return "FlipKartHandling{" +
                "fragile=" + fragile +
                '}';
    }
}
