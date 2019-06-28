package com.sw.param.order;

import com.sw.client.APIId;
import com.sw.client.Request;
import com.sw.client.policy.RequestPolicy;

/**
 * @Author: Dc Lee
 * @Descpription: 获取订单物流信息（包含买家、卖家）
 * @Date: 15:38 2019/6/14
 */
public class GetOrderItemShipmentsInfoParam extends Request<GetOrderItemShipmentsInfoResult> {

    public GetOrderItemShipmentsInfoParam(String[] orderItemIds){
        super();
        StringBuffer sb = new StringBuffer();
        sb.append("?orderItemIds=");
        for (int i=0;i<orderItemIds.length;i++) {
            if (i!=0){
                sb.append(",");
            }
            sb.append(orderItemIds[i]);
        }
        apiId = new APIId("v2/orders","shipments".concat(sb.toString()));
        httpMethod = RequestPolicy.HttpMethodPolicy.GET;
    }
}
