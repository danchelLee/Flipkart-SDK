package com.sw.param.shipment;

import com.sw.client.APIId;
import com.sw.client.Request;
import com.sw.client.policy.RequestPolicy;

/**
 * @Author: Dc Lee
 * @Descpription: 根据shipmentIds、orderItemIds、orderIds获取物流信息
 * @Date: 14:44 2019/4/15
 */
public class GetShipmentsByParam extends Request<GetShipmentsByResult> {

    public GetShipmentsByParam(SearchParameter by,String[] orderIds){
        super();
        StringBuilder sb = new StringBuilder();
        sb.append("shipments?").append(by.getParameter()).append("=");
        for (int i = 0; i<orderIds.length;i++){
            if (i!=0){
                sb.append(",");
            }
            sb.append(orderIds[i]);
        }
        apiId = new APIId("v3",sb.toString());
        httpMethod = RequestPolicy.HttpMethodPolicy.GET;
    }

    public enum SearchParameter{
        shipmentIds("shipmentIds"),
        orderItemIds("orderItemIds"),
        orderIds("orderIds");

        private String parameter;

        SearchParameter(String parameter) {
            this.parameter = parameter;
        }

        public String getParameter() {
            return parameter;
        }

        public void setParameter(String parameter) {
            this.parameter = parameter;
        }
    }
}
