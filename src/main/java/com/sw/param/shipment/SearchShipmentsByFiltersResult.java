package com.sw.param.shipment;

import com.sw.param.listing.FlipKartErrorInfo;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 17:40 2019/4/11
 */
public class SearchShipmentsByFiltersResult {
    private FlipKartErrorInfo error;
    private String message;
    private FlipKartErrorInfo[] errors;
    private String error_description;
    /**
     * 用于访问下一页的网址
     */
    private String nextPageUrl;
    /**
     * 一个标志，指示下一页是否有更多搜索结果
     */
    private Boolean hasMore;
    /**
     * 发货的集合
     */
    private List<FlipKartShipment> shipments;

    public SearchShipmentsByFiltersResult() {
    }

    public FlipKartErrorInfo getError() {
        return error;
    }

    public void setError(FlipKartErrorInfo error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public FlipKartErrorInfo[] getErrors() {
        return errors;
    }

    public void setErrors(FlipKartErrorInfo[] errors) {
        this.errors = errors;
    }

    public String getNextPageUrl() {
        return nextPageUrl;
    }

    public void setNextPageUrl(String nextPageUrl) {
        this.nextPageUrl = nextPageUrl;
    }

    public Boolean getHasMore() {
        return hasMore;
    }

    public void setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
    }

    public List<FlipKartShipment> getShipments() {
        return shipments;
    }

    public void setShipments(List<FlipKartShipment> shipments) {
        this.shipments = shipments;
    }

    public String getError_description() {
        return error_description;
    }

    public void setError_description(String error_description) {
        this.error_description = error_description;
    }

    @Override
    public String toString() {
        return "SearchShipmentsByFiltersResult{" +
                "error=" + error +
                ", message='" + message + '\'' +
                ", errors=" + Arrays.toString(errors) +
                ", error_description='" + error_description + '\'' +
                ", nextPageUrl='" + nextPageUrl + '\'' +
                ", hasMore=" + hasMore +
                ", shipments=" + shipments +
                '}';
    }
}
