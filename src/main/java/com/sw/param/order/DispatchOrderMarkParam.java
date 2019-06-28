package com.sw.param.order;

import com.sw.client.APIId;
import com.sw.client.Request;
import com.sw.client.policy.RequestPolicy;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Author: Dc Lee
 * @Descpription:  Dispatch Orders API将订单商品标记为“准备发货”，并与物流合作伙伴通信订单已准备好接收。
 * @Date: 9:55 2019/4/15
 */
public class DispatchOrderMarkParam extends Request<DispatchOrderMarkResult> {


    /**
     * {
     *   "orderItems": [
     *     {
     *       "quantity": 0,
     *       "orderItemId": ""
     *     }
     *   ]
     * }
     */
    private List<FlipKartOrderItem> orderItems;

    public DispatchOrderMarkParam() {
        super();
        apiId = new APIId("v2/orders", "dispatch");
        httpMethod = RequestPolicy.HttpMethodPolicy.POST;
    }

    public List<FlipKartOrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<FlipKartOrderItem> orderItems) {
        this.orderItems = orderItems;
        addAddtionalParams("orderItems",orderItems);
    }

    @Override
    public String toString() {
        return "DispatchOrderMarkParam{" +
                "orderItems=" + orderItems +
                '}';
    }
}
