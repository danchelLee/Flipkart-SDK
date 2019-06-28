package com.sw.param.listing;

import com.alibaba.fastjson.JSONObject;

import java.util.Map;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 14:16 2019/4/10
 */
public class UpdateListingPriceResult {

    private FlipKartSKUResult sku;
    private JSONObject jsonResult;
    private String status;
    private FlipKartErrorInfo[] attribute_errors;
    public UpdateListingPriceResult() {
    }

    public FlipKartSKUResult getSku() {
        return sku;
    }

    public void setSku(FlipKartSKUResult sku) {
        this.sku = sku;
    }

    public JSONObject getJsonResult() {
        return jsonResult;
    }

    public void setJsonResult(JSONObject jsonResult) {
        this.jsonResult = jsonResult;
        for (Map.Entry<String,Object> entry : jsonResult.entrySet()) {
            Object jsonObject = entry.getValue();
            Object object = ((JSONObject)jsonObject).toJavaObject(FlipKartSKUResult.class);
            if (object instanceof FlipKartSKUResult){
                sku = (FlipKartSKUResult) object ;
            }
        }
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public FlipKartErrorInfo[] getAttribute_errors() {
        return attribute_errors;
    }

    public void setAttribute_errors(FlipKartErrorInfo[] attribute_errors) {
        this.attribute_errors = attribute_errors;
    }

    @Override
    public String toString() {
        return "UpdateListingPriceResult{" +
                "sku=" + sku +
                ", jsonResult=" + jsonResult +
                ", status='" + status + '\'' +
                ", attribute_errors=" + attribute_errors +
                '}';
    }
}
