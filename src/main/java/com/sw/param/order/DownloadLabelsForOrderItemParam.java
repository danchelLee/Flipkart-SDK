package com.sw.param.order;

import com.sw.client.APIId;
import com.sw.client.Request;
import com.sw.client.policy.RequestPolicy;

/**
 * @Author: Dc Lee
 * @Descpription: 下载订单标签
 * @Date: 14:38 2019/4/13
 */
public class DownloadLabelsForOrderItemParam extends Request<DownloadLabelsForOrderItemResult> {

    public DownloadLabelsForOrderItemParam(String[] orderItemIds) {
        StringBuilder sb = new StringBuilder().append("labels?orderItemIds=");
        for (int i = 0; i < orderItemIds.length; i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(orderItemIds[i]);
        }
        apiId = new APIId("/v2/orders", sb.toString());
        httpMethod = RequestPolicy.HttpMethodPolicy.GET;
    }
}
