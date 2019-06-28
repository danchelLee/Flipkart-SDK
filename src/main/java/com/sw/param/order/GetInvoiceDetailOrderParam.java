package com.sw.param.order;

import com.sw.client.APIId;
import com.sw.client.Request;
import com.sw.client.policy.RequestPolicy;

/**
 * @Author: Dc Lee
 * @Descpription: Invoices API提供订单商品的发票详细信息。
 * @Date: 14:07 2019/4/15
 */
public class GetInvoiceDetailOrderParam extends Request<GetInvoiceDetailOrderResult> {

    public GetInvoiceDetailOrderParam(String[] orderItemsIds) {
        super();
        StringBuilder sb = new StringBuilder();
        sb.append("invoices?orderItemIds=");
        for (int i = 0; i < orderItemsIds.length; i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(orderItemsIds[i]);
        }
        apiId = new APIId("v2/orders", sb.toString()+"json");
        httpMethod = RequestPolicy.HttpMethodPolicy.GET;
    }
}
