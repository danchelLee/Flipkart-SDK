package com.sw.param.listing;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 16:33 2019/4/10
 */
public class FlipKartOrderPolicy {
    private Integer maximum_allowed_quantity;
    private Boolean independent_sellable;

    public FlipKartOrderPolicy() {
    }

    public Integer getMaximum_allowed_quantity() {
        return maximum_allowed_quantity;
    }

    public void setMaximum_allowed_quantity(Integer maximum_allowed_quantity) {
        this.maximum_allowed_quantity = maximum_allowed_quantity;
    }

    public Boolean getIndependent_sellable() {
        return independent_sellable;
    }

    public void setIndependent_sellable(Boolean independent_sellable) {
        this.independent_sellable = independent_sellable;
    }

    @Override
    public String toString() {
        return "FlipKartOrderPolicy{" +
                "maximum_allowed_quantity=" + maximum_allowed_quantity +
                ", independent_sellable=" + independent_sellable +
                '}';
    }
}
