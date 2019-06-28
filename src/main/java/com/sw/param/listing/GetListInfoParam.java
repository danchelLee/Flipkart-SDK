package com.sw.param.listing;

import com.sw.client.APIId;
import com.sw.client.Request;
import com.sw.client.policy.RequestPolicy;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 16:15 2019/4/4
 */
public class GetListInfoParam extends Request<GetListInfoResult> {

    public GetListInfoParam(String[] skuIds){
        super();
        StringBuilder value = new StringBuilder();
        for(int i = 0 ; i<skuIds.length;i++){
            if (i!=0){
                value.append(",");
            }
            value.append(skuIds[i]);
        }
        apiId = new APIId("listings/v3",value.toString());
        httpMethod = RequestPolicy.HttpMethodPolicy.GET;
    }

}
