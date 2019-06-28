package com.sw.param.shipment;

import com.sw.client.APIId;
import com.sw.client.Request;
import com.sw.client.policy.RequestPolicy;

/**
 * @Author: Dc Lee
 * @Descpription: “下载标签”API打印包装货件的集成运输标签和发票（可选）。仅当卖方选择自动开票解决方案时才会打印发票。
 * 可以为多个货件ID打印货运标签和客户发票。如果在请求参数中传递了多个货件ID，则会生成单个合并的PDF
 * @Date: 17:09 2019/4/15
 */
public class DownloadLabelsForShipmentParam extends Request<DownloadLabelsForShipmentResult> {

    public DownloadLabelsForShipmentParam(String[] shipmentIds){
        super();
        StringBuilder sb = new StringBuilder();
        for (int i = 0;i<shipmentIds.length;i++){
            if (i!=0){
                sb.append(",");
            }
            sb.append(shipmentIds[i]);
        }
        sb.append("/labelsPDF");
        apiId = new APIId("v3/shipments",sb.toString());
        httpMethod = RequestPolicy.HttpMethodPolicy.GET;
    }


}
