package com.sw.param.shipment;

import com.sw.client.APIId;
import com.sw.client.Request;
import com.sw.client.policy.RequestPolicy;

import java.util.List;

/**
 * @Author: Dc Lee
 * @Descpription:  卖家取消发货
 * @Date: 14:35 2019/4/16
 */
public class CancelShipmentParam extends Request<CancelShipmentResult> {

    /**
     * {
     *   "shipments": [
     *     {
     *       "reason": "",
     *       "cancellationGroupIds": [
     *         ""
     *       ],
     *       "shipmentId": "",
     *       "locationId": ""
     *     }
     *   ]
     * }
     */
    private List<FlipKartShipment> shipments;

    public CancelShipmentParam(){
        super();
        apiId = new APIId("v3/shipments","cancel");
        httpMethod = RequestPolicy.HttpMethodPolicy.POST;
    }

    public List<FlipKartShipment> getShipments() {
        return shipments;
    }

    public void setShipments(List<FlipKartShipment> shipments) {
        this.shipments = shipments;
    }

    @Override
    public String toString() {
        return "CancelShipmentParam{" +
                "shipments=" + shipments +
                '}';
    }
}
