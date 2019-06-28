package com.sw.param.shipment;

import com.sw.client.APIId;
import com.sw.client.Request;
import com.sw.client.policy.RequestPolicy;

import java.util.List;

/**
 * @Author: Dc Lee
 * @Descpription: 自发货商品标记为已发货
 * @Date: 17:05 2019/4/16
 */
public class DeliveryShipmentParam extends Request<DeliveryShipmentResult> {

    /**
     * {
     *   "shipments": [
     *     {
     *       "shipmentId": "",
     *       "deliveryDate": ""
     *     }
     *   ]
     * }
     */
    private List<FlipKartShipment> shipments;

    public DeliveryShipmentParam(){
        super();
        apiId = new APIId("v2/shipments","delivery");
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
        return "DeliveryShipmentParam{" +
                "shipments=" + shipments +
                '}';
    }
}
