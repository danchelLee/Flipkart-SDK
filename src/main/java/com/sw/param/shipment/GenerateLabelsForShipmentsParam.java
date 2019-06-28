package com.sw.param.shipment;

import com.sw.client.APIId;
import com.sw.client.Request;
import com.sw.client.policy.RequestPolicy;

import java.util.Arrays;

/**
 * @Author: Dc Lee
 * @Descpription: 生成物流的标签
 * @Date: 15:37 2019/4/15
 */
public class GenerateLabelsForShipmentsParam extends Request<GenerateLabelsForShipmentsResult> {
    /**
     * {
     *   "shipments": [
     *     {
     *       "taxItems": [
     *         {
     *           "taxRate": "BigDecimal",
     *           "quantity": 0,
     *           "orderItemId": ""
     *         }
     *       ],
     *       "invoices": [
     *         {
     *           "orderId": "",
     *           "invoiceNumber": "",
     *           "invoiceDate": "LocalDate"
     *         }
     *       ],
     *       "shipmentId": "",
     *       "locationId": "",
     *       "serialNumbers": [
     *         {
     *           "orderItemId": "",
     *           "serialNumbers": [
     *             "array"
     *           ]
     *         }
     *       ],
     *       "subShipments": [
     *         {
     *           "subShipmentId": "",
     *           "dimensions": {
     *             "breadth": "BigDecimal",
     *             "length": "BigDecimal",
     *             "weight": "BigDecimal",
     *             "height": "BigDecimal"
     *           }
     *         }
     *       ]
     *     }
     *   ]
     * }
     */
    private FlipKartShipment[] shipments;

    public GenerateLabelsForShipmentsParam(){
        super();
        apiId = new APIId("v3/shipments","labels");
        httpMethod = RequestPolicy.HttpMethodPolicy.POST;
    }

    public FlipKartShipment[] getShipments() {
        return shipments;
    }

    public void setShipments(FlipKartShipment[] shipments) {
        this.shipments = shipments;
        addAddtionalParams("shipments",shipments);
    }

    @Override
    public String toString() {
        return "GenerateLabelsForShipmentsParam{" +
                "shipments=" + Arrays.toString(shipments) +
                '}';
    }
}
