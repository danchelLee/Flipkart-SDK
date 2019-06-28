package com.sw.param.shipment;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 13:54 2019/4/16
 */
public class FlipKartCourierDetail {
    private FlipKartDetail deliveryDetails;
    private FlipKartDetail pickupDetails;

    public FlipKartCourierDetail() {
    }

    public FlipKartDetail getDeliveryDetails() {
        return deliveryDetails;
    }

    public void setDeliveryDetails(FlipKartDetail deliveryDetails) {
        this.deliveryDetails = deliveryDetails;
    }

    public FlipKartDetail getPickupDetails() {
        return pickupDetails;
    }

    public void setPickupDetails(FlipKartDetail pickupDetails) {
        this.pickupDetails = pickupDetails;
    }

    @Override
    public String toString() {
        return "FlipKartCourierDetail{" +
                "deliveryDetails=" + deliveryDetails +
                ", pickupDetails=" + pickupDetails +
                '}';
    }
}
