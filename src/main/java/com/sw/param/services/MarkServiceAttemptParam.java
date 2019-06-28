package com.sw.param.services;

import com.sw.client.APIId;
import com.sw.client.Request;
import com.sw.client.policy.RequestPolicy;

import java.util.List;

/**
 * @Author: Dc Lee
 * @Descpription: 用于标记服务合作伙伴完成的服务尝试。
 * 下一个预定的服务日期也会被标记。
 * @Date: 10:25 2019/4/17
 */
public class MarkServiceAttemptParam extends Request<MarkServiceAttemptResult> {

    /**
     *         [
     *           {
     *             "subReason": "",
     *             "reason": "",
     *             "comments": "",
     *             "newDeliveryDate": "DateTime",
     *             "serviceFulfilmentId": "",
     *             "deliveryDate": "DateTime"
     *           }
     *         ]
     */
    private List<FlipKartService> services;

    public MarkServiceAttemptParam(){
        super();
        apiId = new APIId("v2/services","attempt");
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
        return "MarkServiceAttemptParam{" +
                "services=" + services +
                '}';
    }
}
