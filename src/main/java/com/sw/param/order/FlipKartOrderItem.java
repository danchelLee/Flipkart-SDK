package com.sw.param.order;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 14:22 2019/4/12
 */
public class FlipKartOrderItem {
    /**
     * FK产品唯一标识符 fsn = product_id
     */
    private String fsn;
    /**
     * 订购商品的单位数量。
     */
    private BigDecimal quantity;
    /**
     * 系统为货件中的订单生成orderId。
     */
    private String orderId;
    /**
     * 系统为订单中的商品生成ID。
     */
    private String orderItemId;
    /**
     * 产品的listingId
     */
    private String listingId;
    /**
     * 卖方的商店保管单元，商品可用
     */
    private String sku;
    /**
     * 指将被取消的订单商品组。
     */
    private String cancellationGroupId;
    /**
     * True或False表示订单商品是否替换了另一个订单商品。
     */
    private Boolean isReplacement;
    /**
     * 金额统计
     */
    private FlipKartPriceComponent priceComponents;
    /**
     * 下订单的日期。
     */
    private String orderDate;
    /**
     * 订单项取消的日期。
     */
    private String cancellationDate;
    /**
     * 取消原因
     */
    private String cancellationReason;
    /**
     * 选择取消的子原因。如果卖家取消以下是有效的子原因（cannot_procure_item，not_enough_inventory，b2b_order）
     */
    private CancelOrderParam.FlipKartCancelReason cancellationSubReason;
    /**
     * True或False，表示是否为订单商品创建了快递退货。
     */
    private Boolean courierReturn;
    /**
     * 当前订单处理状态。可能的值：APPROVED，PACKING_IN_PROGRESS，PACKED，READY_TO_DISPATCH，PICKUP_COMPLETE，CANCELLED，SHIPPED，DELIVERED，RETURN_REQUESTED，RETURNED
     */
    private String status;
    private List<String> packageIds;
    /**
     * 	订购商品特定SLA
     */
    private BigDecimal sla;
    private List<String> stateDocuments;
    private List<FlipKartOrderItem> subItems;
    /**
     * 发送时间
     */
    private String dispatchByDate;
    /**
     * 标题
     */
    private String title;
    /**
     * 到达时间？
     */
    private String dispatchAfterDate;
    private Boolean hold;
    private String updatedAt;
    private String shippingPincode;

    private Boolean large;

    private Boolean dangerous;

    private Boolean fragile;

    private String id;

    public FlipKartOrderItem() {
    }

    public Boolean getLarge() {
        return large;
    }

    public void setLarge(Boolean large) {
        this.large = large;
    }

    public Boolean getDangerous() {
        return dangerous;
    }

    public void setDangerous(Boolean dangerous) {
        this.dangerous = dangerous;
    }

    public Boolean getFragile() {
        return fragile;
    }

    public void setFragile(Boolean fragile) {
        this.fragile = fragile;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFsn() {
        return fsn;
    }

    public void setFsn(String fsn) {
        this.fsn = fsn;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(String orderItemId) {
        this.orderItemId = orderItemId;
    }

    public String getListingId() {
        return listingId;
    }

    public void setListingId(String listingId) {
        this.listingId = listingId;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getCancellationGroupId() {
        return cancellationGroupId;
    }

    public void setCancellationGroupId(String cancellationGroupId) {
        this.cancellationGroupId = cancellationGroupId;
    }

    public Boolean getReplacement() {
        return isReplacement;
    }

    public void setReplacement(Boolean replacement) {
        isReplacement = replacement;
    }

    public FlipKartPriceComponent getPriceComponents() {
        return priceComponents;
    }

    public void setPriceComponents(FlipKartPriceComponent priceComponents) {
        this.priceComponents = priceComponents;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getCancellationDate() {
        return cancellationDate;
    }

    public void setCancellationDate(String cancellationDate) {
        this.cancellationDate = cancellationDate;
    }

    public String getCancellationReason() {
        return cancellationReason;
    }

    public void setCancellationReason(String cancellationReason) {
        this.cancellationReason = cancellationReason;
    }

    public CancelOrderParam.FlipKartCancelReason getCancellationSubReason() {
        return cancellationSubReason;
    }

    public void setCancellationSubReason(CancelOrderParam.FlipKartCancelReason cancellationSubReason) {
        this.cancellationSubReason = cancellationSubReason;
    }

    public Boolean getCourierReturn() {
        return courierReturn;
    }

    public void setCourierReturn(Boolean courierReturn) {
        this.courierReturn = courierReturn;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<String> getPackageIds() {
        return packageIds;
    }

    public void setPackageIds(List<String> packageIds) {
        this.packageIds = packageIds;
    }

    public BigDecimal getSla() {
        return sla;
    }

    public void setSla(BigDecimal sla) {
        this.sla = sla;
    }

    public List<String> getStateDocuments() {
        return stateDocuments;
    }

    public void setStateDocuments(List<String> stateDocuments) {
        this.stateDocuments = stateDocuments;
    }

    public List<FlipKartOrderItem> getSubItems() {
        return subItems;
    }

    public void setSubItems(List<FlipKartOrderItem> subItems) {
        this.subItems = subItems;
    }

    public String getDispatchByDate() {
        return dispatchByDate;
    }

    public void setDispatchByDate(String dispatchByDate) {
        this.dispatchByDate = dispatchByDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDispatchAfterDate() {
        return dispatchAfterDate;
    }

    public void setDispatchAfterDate(String dispatchAfterDate) {
        this.dispatchAfterDate = dispatchAfterDate;
    }

    public Boolean getHold() {
        return hold;
    }

    public void setHold(Boolean hold) {
        this.hold = hold;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getShippingPincode() {
        return shippingPincode;
    }

    public void setShippingPincode(String shippingPincode) {
        this.shippingPincode = shippingPincode;
    }

    @Override
    public String toString() {
        return "FlipKartOrderItem{" +
                "fsn='" + fsn + '\'' +
                ", quantity=" + quantity +
                ", orderId='" + orderId + '\'' +
                ", orderItemId='" + orderItemId + '\'' +
                ", listingId='" + listingId + '\'' +
                ", sku='" + sku + '\'' +
                ", cancellationGroupId='" + cancellationGroupId + '\'' +
                ", isReplacement=" + isReplacement +
                ", priceComponents=" + priceComponents +
                ", orderDate='" + orderDate + '\'' +
                ", cancellationDate='" + cancellationDate + '\'' +
                ", cancellationReason='" + cancellationReason + '\'' +
                ", cancellationSubReason=" + cancellationSubReason +
                ", courierReturn=" + courierReturn +
                ", status='" + status + '\'' +
                ", packageIds=" + packageIds +
                ", sla=" + sla +
                ", stateDocuments=" + stateDocuments +
                ", subItems=" + subItems +
                ", dispatchByDate='" + dispatchByDate + '\'' +
                ", title='" + title + '\'' +
                ", dispatchAfterDate='" + dispatchAfterDate + '\'' +
                ", hold=" + hold +
                ", updatedAt='" + updatedAt + '\'' +
                ", shippingPincode='" + shippingPincode + '\'' +
                ", large=" + large +
                ", dangerous=" + dangerous +
                ", fragile=" + fragile +
                ", id='" + id + '\'' +
                '}';
    }
}
