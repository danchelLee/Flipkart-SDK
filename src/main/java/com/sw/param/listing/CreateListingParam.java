package com.sw.param.listing;

import com.sw.client.APIId;
import com.sw.client.Request;
import com.sw.client.policy.RequestPolicy;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 16:00 2019/4/9
 */
public class CreateListingParam extends Request<CreateListingResult> {


    /**
     * {
     *     "<sku>": {
     *         "product_id": "<product-id>",
     *         "price": {
     *             "mrp": 0,
     *             "selling_price": 0,
     *             "currency": "INR"
     *         },
     *         "tax": {
     *             "hsn": "<harmonized-system-nomenclature>",
     *             "tax_code" : "<tax-code to determine goods>"
     *         },
     *         "listing_status": "ACTIVE|INACTIVE",
     *         "shipping_fees": {
     *             "local": 0,
     *             "zonal": 0,
     *             "national": 0,
     *             "currency": "INR"
     *         },
     *         "fulfillment_profile": "NON_FBF|FBF_LITE|FBF",
     *         "fulfillment": {
     *             "dispatch_sla": 1,
     *             "shipping_provider": "FLIPKART|SELLER|FLIPKART_SELLER",
     *             "procurement_type": "REGULAR|EXPRESS|INTERNATIONAL|MADE_TO_ORDER|DOMESTIC"
     *         },
     *         "packages": [
     *             {
     *                 "name": "<package-identifier>",
     *                 "dimensions": {
     *                     "length": 1,
     *                     "breadth": 1,
     *                     "height": 1
     *                 },
     *                 "weight": 1,
     *                 "description": "",
     *                 "handling": {
     *                     "fragile": true
     *                 },
     *                 "notional_value": {
     *                     "amount": 1,
     *                     "unit": "PERCENTAGE|<CURRENCY>"
     *                 }
     *             }
     *         ],
     *         "locations": [
     *             {
     *                 "id": "<location-id>",
     *                 "status": "ENABLED|DISABLED",
     *                 "inventory": 0
     *             }
     *         ],
     *         "address_label": {
     *             "manufacturer_details": [
     *                 "<address_of_manufacturer>"
     *             ],
     *             "importer_details": [
     *                 "<address_of_importer>"
     *             ],
     *             "packer_details": [
     *                 "<address_of_packer>"
     *             ],
     *             "countries_of_origin": [
     *                 "<iso_alpha2_code_of_country_of_origin>"
     *             ]
     *         },
     *         "dating_label": {
     *             "mfg_date": "<Manufacturing date of the product in linux EPOCH (Seconds)>",
     *             "shelf_life": "<Shelf life of the product in Seconds>"
     *         }
     *     }
     * }
     */
    private FlipKartSKU sku;

    private String skuId;

    public CreateListingParam(){
        super();
        apiId = new APIId("listings","v3");
        httpMethod = RequestPolicy.HttpMethodPolicy.POST;
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

    public FlipKartSKU getSku() {
        return sku;
    }

    public void setSku(FlipKartSKU sku) {
        this.sku = sku;
        super.addAddtionalParams("sku",sku);
    }

    @Override
    public String toString() {
        return "CreateListingParam{" +
                "sku=" + sku +
                ", skuId='" + skuId + '\'' +
                '}';
    }
}
