package com.sw.param.listing;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 11:59 2019/4/8
 */
public class FlipKartFulfillment {
    /**
     * 保持产品准备发货所需的时间
     */
    private Integer dispatch_sla;
    /**
     * 告知谁将该产品运送给客户的信息
     */
    private ShippingProvider shipping_provider;
    /**
     * 有关卖方如何采购库存以履行订单的信息
     */
    private ProcurementType procurement_type;

    public FlipKartFulfillment() {
    }

    public FlipKartFulfillment(Integer dispatch_sla, ShippingProvider shipping_provider, ProcurementType procurement_type) {
        this.dispatch_sla = dispatch_sla;
        this.shipping_provider = shipping_provider;
        this.procurement_type = procurement_type;
    }

    public Integer getDispatch_sla() {
        return dispatch_sla;
    }

    public void setDispatch_sla(Integer dispatch_sla) {
        this.dispatch_sla = dispatch_sla;
    }

    public ShippingProvider getShipping_provider() {
        return shipping_provider;
    }

    public void setShipping_provider(ShippingProvider shipping_provider) {
        this.shipping_provider = shipping_provider;
    }

    public ProcurementType getProcurement_type() {
        return procurement_type;
    }

    public void setProcurement_type(ProcurementType procurement_type) {
        this.procurement_type = procurement_type;
    }

    @Override
    public String toString() {
        return "FlipKartFulfillment{" +
                "dispatch_sla=" + dispatch_sla +
                ", shipping_provider=" + shipping_provider +
                ", procurement_type=" + procurement_type +
                '}';
    }
}
