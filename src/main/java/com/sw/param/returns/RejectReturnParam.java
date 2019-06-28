package com.sw.param.returns;

import com.sw.client.APIId;
import com.sw.client.Request;
import com.sw.client.policy.RequestPolicy;

import java.util.List;

/**
 * @Author: Dc Lee
 * @Descpription: 拒绝买家退货（自发货）
 * @Date: 15:27 2019/4/17
 */
public class RejectReturnParam  extends Request<RejectReturnResult> {
    /**
     * {
     *   "returns": [
     *     {
     *       "comments": "",
     *       "serviceDate": "DateTime",
     *       "returnId": "",
     *       "serviceFulfilmentId": ""
     *     }
     *   ]
     * }
     */
    private List<FlipKartReturn> returns;

    public RejectReturnParam(){
        super();
        apiId = new APIId("v2/returns","reject");
        httpMethod = RequestPolicy.HttpMethodPolicy.POST;
    }

    public List<FlipKartReturn> getReturns() {
        return returns;
    }

    public void setReturns(List<FlipKartReturn> returns) {
        this.returns = returns;
        addAddtionalParams("returns",returns);
    }

    @Override
    public String toString() {
        return "RejectReturnParam{" +
                "returns=" + returns +
                '}';
    }
}
