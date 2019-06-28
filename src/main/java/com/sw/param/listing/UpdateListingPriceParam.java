package com.sw.param.listing;

import com.sw.client.APIId;
import com.sw.client.Request;
import com.sw.client.policy.RequestPolicy;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Dc Lee
 * @Descpription: 更新Listing价格
 * @Date: 14:16 2019/4/10
 */
public class UpdateListingPriceParam extends Request<UpdateListingPriceResult> {

    /**
     * 添加sku中product_id和price的参数即可使用
     * {
     *     "<skuId>": {
     *         "product_id": "<product_id>",
     *         "price": {
     *             "mrp": 0,
     *             "selling_price": 0,
     *             "currency": "INR"
     *         }
     *     }
     * }
     */
    private Map<String,Object> params = new HashMap<>();

    public UpdateListingPriceParam(){
        super();
        apiId = new APIId("listings/v3","update/price");
        httpMethod = RequestPolicy.HttpMethodPolicy.POST;
    }

    public Map<String, Object> getParams() {
        return params;
    }

    public void setParams(Map<String, Object> params) {
        this.params = params;
    }

    public void addParam(String skuId,FlipKartSKU sku){
        params.put(skuId,sku);
        super.addAddtionalParams(skuId,sku);
    }

    @Override
    public String toString() {
        return "UpdateListingPriceParam{" +
                "params=" + params +
                '}';
    }
}
