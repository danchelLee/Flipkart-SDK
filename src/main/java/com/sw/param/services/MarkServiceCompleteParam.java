package com.sw.param.services;

import com.sw.client.APIId;
import com.sw.client.Request;
import com.sw.client.policy.RequestPolicy;

import java.util.List;

/**
 * @Author: Dc Lee
 * @Descpription: 标记(自发货)服务为已完成
 * @Date: 11:04 2019/4/17
 */
public class MarkServiceCompleteParam  extends Request<MarkServiceCompleteResult> {
    /**
     * [
     *     {
     *       "serviceFulfilmentId": "",
     *       "deliveryDate": "Datetime"
     *     }
     *   ]
     */
    private List<FlipKartService> services;

    public MarkServiceCompleteParam(){
        super();
        apiId = new APIId("v2/services","complete");
        httpMethod = RequestPolicy.HttpMethodPolicy.POST;
    }

    public List<FlipKartService> getServices() {
        return services;
    }

    public void setServices(List<FlipKartService> services) {
        this.services = services;
        addAddtionalParams("services",services);
    }

    @Override
    public String toString() {
        return "MarkServiceCompleteParam{" +
                "services=" + services +
                '}';
    }
}
