package com.sw.param.order;

import java.util.List;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 16:02 2019/4/12
 */
public class FlipKartOrderFilter {

    /**
     * 根据所选日期范围内的订单进行过滤，其中日期字符串采用ISO格式
     */
    private FlipKartOrderDate orderDate;
    /**
     * 根据要在所选日期范围内处理的订单进行过滤，其中日期字符串采用ISO格式
     */
    private FlipKartOrderDate dispatchAfterDate;
    /**
     * 根据要在所选日期范围内调度的订单进行过滤，其中日期字符串采用ISO格式
     */
    private FlipKartOrderDate dispatchByDate;
    /**
     *过滤在所选日期范围内修改的订单，其中日期字符串为ISO格式
     */
    private FlipKartOrderDate modifiedDate;

    /**
     * 根据逗号分隔的有效订单状态列表过滤订单。现在不支持基于处理状态的过滤。可能的值
     * APPROVED,``PACKED``, READY_TO_DISPATCH, and CANCELLED
     */
    private List<String> states;
    /**
     * 根据逗号分隔的卖家SKU列表过滤订单
     */
    private List<String> sku;

    public FlipKartOrderFilter() {
    }

    public FlipKartOrderFilter(FlipKartOrderDate orderDate, FlipKartOrderDate dispatchAfterDate, FlipKartOrderDate dispatchByDate, FlipKartOrderDate modifiedDate, List<String> states, List<String> sku) {
        this.orderDate = orderDate;
        this.dispatchAfterDate = dispatchAfterDate;
        this.dispatchByDate = dispatchByDate;
        this.modifiedDate = modifiedDate;
        this.states = states;
        this.sku = sku;
    }

    public FlipKartOrderDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(FlipKartOrderDate orderDate) {
        this.orderDate = orderDate;
    }

    public FlipKartOrderDate getDispatchAfterDate() {
        return dispatchAfterDate;
    }

    public void setDispatchAfterDate(FlipKartOrderDate dispatchAfterDate) {
        this.dispatchAfterDate = dispatchAfterDate;
    }

    public FlipKartOrderDate getDispatchByDate() {
        return dispatchByDate;
    }

    public void setDispatchByDate(FlipKartOrderDate dispatchByDate) {
        this.dispatchByDate = dispatchByDate;
    }

    public FlipKartOrderDate getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(FlipKartOrderDate modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public List<String> getStates() {
        return states;
    }

    public void setStates(List<String> states) {
        this.states = states;
    }

    public List<String> getSku() {
        return sku;
    }

    public void setSku(List<String> sku) {
        this.sku = sku;
    }

    @Override
    public String toString() {
        return "FlipKartOrderFilter{" +
                "orderDate=" + orderDate +
                ", dispatchAfterDate=" + dispatchAfterDate +
                ", dispatchByDate=" + dispatchByDate +
                ", modifiedDate=" + modifiedDate +
                ", states=" + states +
                ", sku=" + sku +
                '}';
    }
}
