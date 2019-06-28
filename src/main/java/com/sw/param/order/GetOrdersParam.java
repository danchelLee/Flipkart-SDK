package com.sw.param.order;

import com.sw.client.APIId;
import com.sw.client.Request;
import com.sw.client.policy.RequestPolicy;

/**
 * @Author: Dc Lee
 * @Descpription: 查询多个orderItemId的数据信息
 * @Date: 10:09 2019/4/13
 */
public class GetOrdersParam extends Request<GetOrdersResult> {

    public GetOrdersParam(String[] orderItemIds){
        StringBuilder sb = new StringBuilder().append("?orderItemIds=");
        for (int i=0 ; i<orderItemIds.length;i++){
            if (i!=0){
                sb.append(",");
            }
            sb.append(orderItemIds[i]);
        }
        apiId = new APIId("v2/orders",sb.toString());
        httpMethod = RequestPolicy.HttpMethodPolicy.GET;
    }
}
