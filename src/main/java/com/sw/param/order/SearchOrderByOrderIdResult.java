package com.sw.param.order;

import com.sw.param.listing.FlipKartErrorInfo;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 17:45 2019/4/12
 */
public class SearchOrderByOrderIdResult {
    private FlipKartErrorInfo error;
    private String message;
    private FlipKartErrorInfo[] errors;
    private String code;
    /**
     * 用于访问下一页的网址
     */
    private String nextPageUrl;
    /**
     * 一个标志，指示下一页是否有更多搜索结果
     */
    private Boolean hasMore;
    /**
     * 对此URL的GET调用将获取上一页的结果。第一页不存在
     */
    private String previousPageUrl;
    private List<FlipKartOrderItem> orderItems;
    private String url;

    public SearchOrderByOrderIdResult() {
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

    public String getPreviousPageUrl() {
        return previousPageUrl;
    }

    public void setPreviousPageUrl(String previousPageUrl) {
        this.previousPageUrl = previousPageUrl;
    }

    public List<FlipKartOrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<FlipKartOrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "SearchOrderByOrderIdResult{" +
                "error=" + error +
                ", message='" + message + '\'' +
                ", errors=" + Arrays.toString(errors) +
                ", code='" + code + '\'' +
                ", nextPageUrl='" + nextPageUrl + '\'' +
                ", hasMore=" + hasMore +
                ", previousPageUrl='" + previousPageUrl + '\'' +
                ", orderItems=" + orderItems +
                ", url='" + url + '\'' +
                '}';
    }
}
