package com.sw.param.returns;

import com.sw.client.APIId;
import com.sw.client.Request;
import com.sw.client.policy.RequestPolicy;

import java.util.List;

/**
 * @Author: Dc Lee
 * @Descpription: 标记买家寄回的包裹已验收
 * @Date: 16:32 2019/4/17
 */
public class PickupAttemptReturnsParam extends Request<PickupAttemptReturnsResult> {
    /**
     * {
     *   "returns": [
     *     {
     *       "reason": "",
     *       "returnId": "",
     *       "pickupDate": "DateTime",
     *       "newPickupDate": "DateTime"
     *     }
     *   ]
     * }
     */
    private List<FlipKartReturn> returns;

    public PickupAttemptReturnsParam(){
        super();
        apiId = new APIId("v2/returns","pickupAttempt");
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
        return "PickupAttemptReturnsParam{" +
                "returns=" + returns +
                '}';
    }
}
