package com.sw.param.order;

import com.sw.client.APIId;
import com.sw.client.Request;
import com.sw.client.policy.RequestPolicy;

/**
 * @Author: Dc Lee
 * @Descpription: 获取供应商详细信息api提供属于特定供应商的货件数量。
 * 它给出了RTD状态下的出货数量。
 * @Date: 15:52 2019/4/16
 */
public class GetShipmentHandoverCountsParam extends Request<GetShipmentHandoverCountsResult> {

    public GetShipmentHandoverCountsParam(String locationId){
        super();
        StringBuilder sb = new StringBuilder();
        sb.append("counts?locationId=");
        sb.append(locationId);
        apiId = new APIId("v3/shipments/handover",sb.toString());
        httpMethod = RequestPolicy.HttpMethodPolicy.GET;
    }
}
