package com.sw.param.listing;

import com.sw.client.APIId;
import com.sw.client.Request;
import com.sw.client.policy.RequestPolicy;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Dc Lee
 * @Descpription: 更新Listing库存
 * @Date: 14:30 2019/4/10
 */
public class UpdateListingInventoryParam extends Request<UpdateListingInventoryResult> {
    /**
     * 添加sku中product_id和locations的参数即可使用
     * {
     *     "<sku>": {
     *         "product_id": "<product_id>",
     *         "locations": [
     *             {
     *                 "id": "<location-id>",
     *                 "inventory": 0
     *             }
     *         ]
     *     }
     * }
     */
    private Map<String,Object> params = new HashMap<>();

    public UpdateListingInventoryParam(){
        super();
        apiId = new APIId("listings/v3","update/inventory");
        httpMethod = RequestPolicy.HttpMethodPolicy.POST;

    }

    public void addParam(String skuId,FlipKartSKU sku){
        params.put(skuId,sku);
        super.addAddtionalParams(skuId,sku);
    }

    public Map<String, Object> getParams() {
        return params;
    }

    public void setParams(Map<String, Object> params) {
        this.params = params;
    }

    @Override
    public String toString() {
        return "UpdateListingInventoryParam{" +
                "params=" + params +
                '}';
    }
}
