package com.sw.param.shipment;

import com.sw.client.APIId;
import com.sw.client.Request;
import com.sw.client.policy.RequestPolicy;

/**
 * @Author: Dc Lee
 * @Descpription: 货件发票API打印已打包货件的发票。
 * 如果内容类型为application / pdf，则提供pdf文档，
 * 如果内容类型为application / json，则提供json响应。
 * @Date: 18:09 2019/4/15
 */
public class DownloadInvoicesForShipmentParam extends Request<DownloadInvoicesForShipmentResult> {

    /**
     * @param contentType json或PDF
     * @param shipmentIds
     */
    public DownloadInvoicesForShipmentParam(String contentType,String[] shipmentIds){
        super();
        StringBuilder sb = new StringBuilder();
        for (int i = 0;i<shipmentIds.length;i++){
            if (i!=0){
                sb.append(",");
            }
            sb.append(shipmentIds[i]);
        }
        sb.append("/invoices").append(contentType);
        apiId = new APIId("v3/shipments",sb.toString());
        httpMethod = RequestPolicy.HttpMethodPolicy.GET;
    }

}
