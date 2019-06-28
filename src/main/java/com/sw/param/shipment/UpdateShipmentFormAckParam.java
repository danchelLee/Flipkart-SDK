package com.sw.param.shipment;

import com.sw.client.APIId;
import com.sw.client.Request;
import com.sw.client.policy.RequestPolicy;

import java.util.List;

/**
 * @Author: Dc Lee
 * @Descpription: 更新货运表单ACK编号
 * @Date: 15:24 2019/4/16
 */
public class UpdateShipmentFormAckParam extends Request<UpdateShipmentFormAckResult> {
    /**
     * {
     *   "shipments": [
     *     {
     *       "shipmentId": "",
     *       "forms": [
     *         {
     *           "name": "",
     *           "ackNumber": ""
     *         }
     *       ]
     *     }
     *   ]
     * }
     */
    private List<FlipKartShipment> shipments;

    public UpdateShipmentFormAckParam(){
        super();
        apiId = new APIId("v3/shipments","forms/updateAck");
        httpMethod = RequestPolicy.HttpMethodPolicy.POST;
    }

    public List<FlipKartShipment> getShipments() {
        return shipments;
    }

    public void setShipments(List<FlipKartShipment> shipments) {
        this.shipments = shipments;
        addAddtionalParams("shipments",shipments);
    }

    @Override
    public String toString() {
        return "UpdateShipmentFormAckParam{" +
                "shipments=" + shipments +
                '}';
    }
}
