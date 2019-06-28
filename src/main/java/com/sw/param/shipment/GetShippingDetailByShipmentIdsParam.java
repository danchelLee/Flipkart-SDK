package com.sw.param.shipment;

import com.sw.client.APIId;
import com.sw.client.Request;
import com.sw.client.policy.RequestPolicy;

/**
 * @Author: Dc Lee
 * @Descpription: 根据shipmentIds获取送货信息
 * 建议限制为25 shipmentIds。
 * @Date: 11:38 2019/4/16
 */
public class GetShippingDetailByShipmentIdsParam extends Request<GetShippingDetailByShipmentIdsResult> {

    public GetShippingDetailByShipmentIdsParam(String[] shipmentIds){
        super();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < shipmentIds.length; i++) {
            if (i!=0){
                sb.append(",");
            }
            sb.append(shipmentIds[i]);
        }
        apiId = new APIId("v3/shipments",sb.toString());
        httpMethod = RequestPolicy.HttpMethodPolicy.GET;
    }
}
