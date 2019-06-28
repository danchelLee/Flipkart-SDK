package com.sw.param.listing;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 16:20 2019/4/4
 */
public class GetListInfoResult {

    private JSONObject available;

    private String[] invalid;

    private String[] unavailable;
    
    private List<FlipKartSKU> skus;

    public String[] getInvalid() {
        return invalid;
    }

    public void setInvalid(String[] invalid) {
        this.invalid = invalid;
    }

    public String[] getUnavailable() {
        return unavailable;
    }

    public void setUnavailable(String[] unavailable) {
        this.unavailable = unavailable;
    }

    public GetListInfoResult() {
    }

    public GetListInfoResult(JSONObject available) {
        this.available = available;
    }

    public JSONObject getAvailable() {
        return available;
    }

    public void setAvailable(JSONObject available) {
        this.available = available;
        List<FlipKartSKU> skus = new ArrayList<>();
        if (available != null) {
            for (Map.Entry<String,Object> entry : available.entrySet()) {
                Object jsonObject = entry.getValue();
                Object object = ((JSONObject)jsonObject).toJavaObject(FlipKartSKU.class);
                if (object instanceof FlipKartSKU){
                    FlipKartSKU sku = (FlipKartSKU) object;
                    sku.setSku(entry.getKey());
                    skus.add(sku);
                }
            }
            setSkus(skus);
        }
    }

    public List<FlipKartSKU> getSkus() {
        return skus;
    }

    public void setSkus(List<FlipKartSKU> skus) {
        this.skus = skus;
    }

    @Override
    public String toString() {
        return "GetListInfoResult{" +
                "available=" + available +
                ", invalid=" + Arrays.toString(invalid) +
                ", unavailable=" + Arrays.toString(unavailable) +
                ", sku=" + skus +
                '}';
    }
}
