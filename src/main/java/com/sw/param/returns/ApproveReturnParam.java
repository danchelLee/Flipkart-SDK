package com.sw.param.returns;

import com.sw.client.APIId;
import com.sw.client.Request;
import com.sw.client.policy.RequestPolicy;

import java.util.List;

/**
 * @Author: Dc Lee
 * @Descpription: 批准买家（自发货商品）退货
 * @Date: 14:02 2019/4/17
 */
public class ApproveReturnParam extends Request<ApproveReturnResult> {


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

    public ApproveReturnParam(){
        super();
        apiId = new APIId("v2/returns","approve");
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
        return "ApproveReturnParam{" +
                "returns=" + returns +
                '}';
    }
}
