package com.sw.param.returns;

import com.sw.client.APIId;
import com.sw.client.Request;
import com.sw.client.policy.RequestPolicy;

/**
 * @Author: Dc Lee
 * @Descpription: 获取return的详细信息
 * @Date: 14:32 2019/4/17
 */
public class GetReturnsParam extends Request<GetReturnsResult> {

    public GetReturnsParam(String[] returnIds){
        super();
        StringBuilder sb = new StringBuilder();
        sb.append("returns?returnIds=");
        for (int i = 0; i < returnIds.length; i++) {
            if (i != 0){
                sb.append(",");
            }
            sb.append(returnIds[i]);
        }
        apiId = new APIId("v2",sb.toString());
        httpMethod = RequestPolicy.HttpMethodPolicy.GET;
    }
}
