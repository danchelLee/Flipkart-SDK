package com.sw.param.order;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 11:31 2019/4/12
 */
public class FlipKartSort {
    private String field = "dispatchByDate";
    private FlipKartSortOrder order;

    public FlipKartSort() {
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public FlipKartSortOrder getOrder() {
        return order;
    }

    @Override
    public String toString() {
        return "FlipKartSort{" +
                "field='" + field + '\'' +
                ", order=" + order +
                '}';
    }

    public void setOrder(FlipKartSortOrder order) {
        this.order = order;
    }

    public enum FlipKartSortOrder{
        desc,
        asc
    }
}
