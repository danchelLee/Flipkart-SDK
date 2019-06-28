package com.sw.param.listing;

import com.sw.client.APIId;
import com.sw.client.Request;
import com.sw.client.policy.RequestPolicy;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Dc Lee
 * @Descpription: 更新Listing
 * @Date: 14:02 2019/4/10
 */
public class UpdateProductListingsParam extends Request<UpdateProductListingsResult> {


    /**
     * 不要填写listing_id以及order_policy，其他都要填写
     * {
     *
     *     "SZZ75112": {
     *
     *       "product_id": "xxxxxx",
     *       "price": {
     *         "mrp": 4500,
     *         "selling_price": 4200,
     *         "currency": "INR"
     *       },
     *       "tax": {
     *         "hsn": "61046200",
     *         "tax_code": "GST_APPAREL",
     *         "luxury_cess_percentage": 4.0
     *       },
     *       "listing_status": "INACTIVE",
     *       "shipping_fees": {
     *         "local": 0,
     *         "zonal": 45,
     *         "national": 65,
     *         "currency": "INR"
     *       },
     *       "fulfillment_profile": "NON_FBF",
     *       "packages": [
     *         {
     *           "id": "xxxxxxx",
     *           "name": "SZZ75112",
     *           "dimensions": {
     *             "length": 30.0,
     *             "breadth": 30.0,
     *             "height": 1.3
     *           },
     *           "weight": 0.3,
     *           "handling": {
     *             "fragile": false
     *           }
     *         }
     *       ],
     *       "locations": [
     *         {
     *           "id": "xxxxxxx",
     *           "status": "ENABLED",
     *           "inventory": 20,
     *           "pending_inventory": 0
     *         }
     *       ]
     *     }
     *
     * }
     */
    private FlipKartSKU sku;

    private String skuId;

    public UpdateProductListingsParam(){
        super();
        apiId = new APIId("listings/v3","update");
        httpMethod = RequestPolicy.HttpMethodPolicy.POST;
    }

    public FlipKartSKU getSku() {
        return sku;
    }

    public void setSku(FlipKartSKU sku) {
        this.sku = sku;
    }

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public void addParam(String skuId, FlipKartSKU sku){
        super.addAddtionalParams(skuId,sku);
    }

    @Override
    public String toString() {
        return "UpdateProductListingsParam{" +
                "sku=" + sku +
                ", skuId='" + skuId + '\'' +
                '}';
    }
}
