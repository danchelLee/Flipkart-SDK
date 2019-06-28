package com.sw.param.shipment;

import java.util.List;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 11:28 2019/6/20
 */
public class ShipmentDispatchSelfshipResult {

    private List<FlipKartShipmentResult> shipments;

    public ShipmentDispatchSelfshipResult() {
    }

    public List<FlipKartShipmentResult> getShipments() {
        return shipments;
    }

    public void setShipments(List<FlipKartShipmentResult> shipments) {
        this.shipments = shipments;
    }

    @Override
    public String toString() {
        return "ShipmentDispatchSelfshipResult{" +
                "shipments=" + shipments +
                '}';
    }
}
