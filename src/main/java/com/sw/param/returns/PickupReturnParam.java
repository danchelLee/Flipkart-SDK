package com.sw.param.returns;

import com.sw.client.APIId;
import com.sw.client.Request;
import com.sw.client.policy.RequestPolicy;

import java.util.List;

/**
 * @Author: Dc Lee
 * @Descpription: 标记买家退回的包裹已收到（自发货）
 * @Date: 15:53 2019/4/17
 */
public class PickupReturnParam extends Request<PickupReturnResult> {
    /**
     * {
     *   "returns": [
     *     {
     *       "returnId": "",
     *       "pickupDate": "DateTime"
     *     }
     *   ]
     * }
     */
    private List<FlipKartReturn> returns;

    public PickupReturnParam(){
        super();
        apiId = new APIId("v2/returns","pickup");
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
        return "PickupReturnParam{" +
                "returns=" + returns +
                '}';
    }
}
