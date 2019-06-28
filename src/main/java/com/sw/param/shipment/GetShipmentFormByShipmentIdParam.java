package com.sw.param.shipment;

import com.sw.client.APIId;
import com.sw.client.Request;
import com.sw.client.policy.RequestPolicy;

/**
 * @Author: Dc Lee
 * @Descpription: 提供与给定货件ID相关联的表单
 * @Date: 14:48 2019/4/16
 */
public class GetShipmentFormByShipmentIdParam extends Request<GetShipmentFormByShipmentIdResult> {

    public GetShipmentFormByShipmentIdParam(String[] shipmentIds){
        super();
        StringBuilder sb = new StringBuilder();
        sb.append("v3/shipments/");
        for (int i = 0; i < shipmentIds.length; i++) {
            if (i!=0){
                sb.append(",");
            }
            sb.append(shipmentIds[i]);
        }
        apiId = new APIId(sb.toString(),"forms");
        httpMethod = RequestPolicy.HttpMethodPolicy.GET;
    }
}
