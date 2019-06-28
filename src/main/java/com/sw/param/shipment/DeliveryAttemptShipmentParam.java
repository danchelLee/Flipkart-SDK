package com.sw.param.shipment;

import com.sw.client.APIId;
import com.sw.client.Request;
import com.sw.client.policy.RequestPolicy;

import java.util.List;

/**
 * @Author: Dc Lee
 * @Descpription:  用于标记尝试传递的Self Ship API
 * @Date: 17:47 2019/4/16
 */
public class DeliveryAttemptShipmentParam extends Request<DeliveryAttemptShipmentResult> {

    /**
     * {
     *   "shipments": [
     *     {
     *       "shipmentId": "",
     *       "deliveryDate": "DateTime",
     *       "failureAttributes": {
     *         "subReason": "",
     *         "reason": "",
     *         "newDeliveryDate": "DateTime"
     *       }
     *     }
     *   ]
     * }
     */
    private List<FlipKartShipment> shipments;

    public DeliveryAttemptShipmentParam(){
        super();
        apiId = new APIId("v2/shipments","deliveryAttempt");
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
        return "DeliveryAttemptShipmentParam{" +
                "shipments=" + shipments +
                '}';
    }
}
