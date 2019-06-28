package com.sw.param.order;

import com.sw.client.APIId;
import com.sw.client.Request;
import com.sw.client.policy.RequestPolicy;

/**
 * @Author: Dc Lee
 * @Descpription: 清单PDF提供属于指定供应商的货件,返回PDF
 * @Date: 16:43 2019/4/16
 */
public class GetShipmentManifestParam extends Request<GetShipmentManifestResult> {
    private FlipKartShipmentManifest params;

    public GetShipmentManifestParam(){
        super();
        apiId = new APIId("v3/shipments","manifest");
        httpMethod = RequestPolicy.HttpMethodPolicy.POST;
    }

    public FlipKartShipmentManifest getParams() {
        return params;
    }

    public void setParams(FlipKartShipmentManifest params) {
        this.params = params;
        addAddtionalParams("params",params);
    }
}
