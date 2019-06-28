package com.sw.param.shipment;

import com.sw.param.order.FlipKartDate;

import java.util.List;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 17:42 2019/4/11
 */
public class FlipKartShipmentsFilters {


    /**
     * 必填
     * 调度类型有三种:
     * preDispatch
     * postDispatch
     * cancelled
     */
    private FlipKartDispathTypeEnum type;
    /**
     * 必填
     * 根据逗号分隔的有效装运状态列表过滤装运。可能的值:
     * APPROVED,
     * PACKING_IN_PROGRESS,
     * PACKED,
     * FORM_FAILED,
     * READY_TO_DISPATCH,
     * SHIPPED,
     * DELIVERED
     */
    private List<String> states;
    /**
     * 根据逗号分隔的卖家SKU列表过滤订单
     */
    private List<String> sku;
    /**
     * 该字段默认为 NON_FBF
     */
    private String serviceProfiles;
    /**
     * 多包装货物可否接受
     */
    private Boolean mps;
    /**
     * 货物的原产地
     */
    private String sources;
    /**
     *指的是卖方的派遣地点id
     */
    private String locationId;
    /**
     * 描述取消启动的位置。例如，如果市场取消，则此值为MarketPlace Cancellation。
     */
    private String cancellationType;
    /**
     * 选择的订单起止时间,根据所选日期范围内的货件进行过滤，其中日期字符串采用ISO格式
     */
    private FlipKartDate orderDate;
    /**
     * 选择的dispatch后的起止时间,根据所选日期范围内的货件进行过滤，其中日期字符串采用ISO格式
     */
    private FlipKartDate dispatchAfterDate;
    private FlipKartDate dispatchByDate;
    private FlipKartDate cancellationDate;

    public FlipKartShipmentsFilters() {
    }

    public FlipKartDispathTypeEnum getType() {
        return type;
    }

    public void setType(FlipKartDispathTypeEnum type) {
        this.type = type;
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

    public String getServiceProfiles() {
        return serviceProfiles;
    }

    public void setServiceProfiles(String serviceProfiles) {
        this.serviceProfiles = serviceProfiles;
    }

    public Boolean getMps() {
        return mps;
    }

    public void setMps(Boolean mps) {
        this.mps = mps;
    }

    public String getSources() {
        return sources;
    }

    public void setSources(String sources) {
        this.sources = sources;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public String getCancellationType() {
        return cancellationType;
    }

    public void setCancellationType(String cancellationType) {
        this.cancellationType = cancellationType;
    }

    public FlipKartDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(FlipKartDate orderDate) {
        this.orderDate = orderDate;
    }

    public FlipKartDate getDispatchAfterDate() {
        return dispatchAfterDate;
    }

    public void setDispatchAfterDate(FlipKartDate dispatchAfterDate) {
        this.dispatchAfterDate = dispatchAfterDate;
    }

    public FlipKartDate getDispatchByDate() {
        return dispatchByDate;
    }

    public void setDispatchByDate(FlipKartDate dispatchByDate) {
        this.dispatchByDate = dispatchByDate;
    }

    public FlipKartDate getCancellationDate() {
        return cancellationDate;
    }

    public void setCancellationDate(FlipKartDate cancellationDate) {
        this.cancellationDate = cancellationDate;
    }

    @Override
    public String toString() {
        return "FlipKartShipmentsFilters{" +
                "type=" + type +
                ", states=" + states +
                ", sku=" + sku +
                ", serviceProfiles='" + serviceProfiles + '\'' +
                ", mps=" + mps +
                ", sources='" + sources + '\'' +
                ", locationId='" + locationId + '\'' +
                ", cancellationType='" + cancellationType + '\'' +
                ", orderDate=" + orderDate +
                ", dispatchAfterDate=" + dispatchAfterDate +
                ", dispatchByDate=" + dispatchByDate +
                ", cancellationDate=" + cancellationDate +
                '}';
    }

    public enum FlipKartDispathTypeEnum {
        preDispatch,
        postDispatch,
        cancelled
    }
}
