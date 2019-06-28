package com.sw.param.shipment;

import com.sw.client.APIId;
import com.sw.client.Request;
import com.sw.client.policy.RequestPolicy;

import java.util.List;

/**
 * @Author: Dc Lee
 * @Descpription: 将装运中的订单项标记为“准备发货”，并与物流合作伙伴通信货物已准备好提货。
 * @Date: 11:12 2019/4/16
 */
public class DispatchShipmentMarkParam extends Request<DispatchShipmentMarkResult> {
    private List<String> shipmentIds;
    private String locationId;

    public DispatchShipmentMarkParam(){
        super();
        apiId = new APIId("v3/shipments","dispatch");
        httpMethod = RequestPolicy.HttpMethodPolicy.POST;
    }

    public List<String> getShipmentIds() {
        return shipmentIds;
    }

    public void setShipmentIds(List<String> shipmentIds) {
        this.shipmentIds = shipmentIds;
        addAddtionalParams("shipmentIds",shipmentIds);
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
        addAddtionalParams("locationId",locationId);
    }

    @Override
    public String toString() {
        return "DispatchShipmentMarkParam{" +
                "shipmentIds=" + shipmentIds +
                ", locationId='" + locationId + '\'' +
                '}';
    }

}
