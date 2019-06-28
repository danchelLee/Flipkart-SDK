package com.sw.param.order;

import com.sw.client.APIId;
import com.sw.client.Request;
import com.sw.client.policy.RequestPolicy;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 17:44 2019/4/12
 */
public class SearchOrderByOrderIdParam extends Request<SearchOrderByOrderIdResult> {

    public SearchOrderByOrderIdParam(String orderId){
        apiId = new APIId("v2/orders",orderId);
        httpMethod = RequestPolicy.HttpMethodPolicy.GET;
    }
}
