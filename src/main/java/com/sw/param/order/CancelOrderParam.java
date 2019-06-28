package com.sw.param.order;

import com.sw.client.APIId;
import com.sw.client.Request;
import com.sw.client.policy.RequestPolicy;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 13:39 2019/4/15
 */
public class CancelOrderParam extends Request<CancelOrderResult> {

    /**
     * {
     *   "orderItems": [
     *     {
     *       "orderItemId": "",
     *       "reason": ""
     *     }
     *   ]
     * }
     */
    private List<FlipKartCancelOrderItem> orderItems;

    public CancelOrderParam() {
        super();
        apiId = new APIId("v2/orders", "cancel");
        httpMethod = RequestPolicy.HttpMethodPolicy.POST;
    }

    public List<FlipKartCancelOrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<FlipKartCancelOrderItem> orderItems) {
        this.orderItems = orderItems;
        addAddtionalParams("orderItems",orderItems);
    }

    @Override
    public String toString() {
        return "CancelOrderParam{" +
                "orderItems=" + orderItems +
                '}';
    }

    public enum FlipKartCancelReason {
        /**
         * 不能采购项目
         */
        cannot_procure_item((byte)1,"cannot_procure_item"),
        /**
         * 库存不足
         */
        not_enough_inventory((byte)2,"not_enough_inventory"),
        /**
         * B2B订单
         */
        b2b_order((byte)3,"b2b_order");

        public byte status;
        public String description;

        FlipKartCancelReason(byte status, String description) {
            this.status = status;
            this.description = description;
        }

        FlipKartCancelReason() {
        }

        public static String getDescriptionByStatus(byte status){
            for ( FlipKartCancelReason cancelReason : FlipKartCancelReason.values() ) {
                if (cancelReason.status == status){
                    return cancelReason.description;
                }
            }
            return null;
        }

        public static Byte getStatusByDescription(String description){
            for ( FlipKartCancelReason cancelReason : FlipKartCancelReason.values() ) {
                if (cancelReason.description.equals(description)){
                    return cancelReason.status;
                }
            }
            return null;
        }

        public static FlipKartCancelReason getEnumByStatus(byte status){
            for ( FlipKartCancelReason cancelReason : FlipKartCancelReason.values() ) {
                if (cancelReason.status==status){
                    return cancelReason;
                }
            }
            return null;
        }
    }
}
