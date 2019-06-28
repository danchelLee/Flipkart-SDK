package com.sw.param.shipment;

import com.sw.client.APIId;
import com.sw.client.Request;
import com.sw.client.policy.RequestPolicy;

import java.util.List;

/**
 * @Author: Dc Lee
 * @Descpription:  Self Ship API，用于标记从卖方仓库发送的项目。除了标记从仓库发货的物品外，卖方还必须输入发票详细信息
 * @Date: 11:27 2019/6/20
 */
public class ShipmentDispatchSelfshipParam extends Request<ShipmentDispatchSelfshipResult> {

    private List<FlipKartShipment> shipments;

    public ShipmentDispatchSelfshipParam() {
        super();
        apiId = new APIId("v2/shipments","dispatch");
        httpMethod = RequestPolicy.HttpMethodPolicy.POST;
    }

    public List<FlipKartShipment> getShipments() {
        return shipments;
    }

    public void setShipments(List<FlipKartShipment> shipments) {
        this.shipments = shipments;
    }
}
