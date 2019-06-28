package com.sw.param.returns;

import com.sw.client.APIId;
import com.sw.client.Request;
import com.sw.client.policy.RequestPolicy;

import java.util.List;

/**
 * @Author: Dc Lee
 * @Descpription: 标记已完成退货（自发货）
 * @Date: 15:36 2019/4/17
 */
public class CompleteReturnParam extends Request<CompleteReturnResult> {
    private List<String> returnIds;

    public CompleteReturnParam(){
        super();
        apiId = new APIId("v2/returns","complete");
        httpMethod = RequestPolicy.HttpMethodPolicy.POST;
    }

    public List<String> getReturnIds() {
        return returnIds;
    }

    public void setReturnIds(List<String> returnIds) {
        this.returnIds = returnIds;
        addAddtionalParams("returnIds",returnIds);
    }

    @Override
    public String toString() {
        return "CompleteReturnParam{" +
                "returnIds=" + returnIds +
                '}';
    }
}
