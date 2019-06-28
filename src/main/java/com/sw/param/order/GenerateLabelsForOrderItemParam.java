package com.sw.param.order;

import com.sw.client.APIId;
import com.sw.client.Request;
import com.sw.client.policy.RequestPolicy;

import java.util.List;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 11:11 2019/4/13
 */
public class GenerateLabelsForOrderItemParam extends Request<GenerateLabelsForOrderItemResult> {
    private List<FlipKartOrderLabel> orderItems;

    public GenerateLabelsForOrderItemParam(){
        super();
        apiId = new APIId("v2/orders","labels");
        httpMethod = RequestPolicy.HttpMethodPolicy.POST;
    }

    public List<FlipKartOrderLabel> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<FlipKartOrderLabel> orderItems) {
        this.orderItems = orderItems;
        addAddtionalParams("orderItems",orderItems);
    }

    @Override
    public String toString() {
        return "GenerateLabelsForOrderItemParam{" +
                "orderItems=" + orderItems +
                '}';
    }
}
