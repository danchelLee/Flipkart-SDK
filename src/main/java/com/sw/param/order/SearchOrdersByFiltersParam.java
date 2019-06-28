package com.sw.param.order;

import com.sw.client.APIId;
import com.sw.client.Request;
import com.sw.client.policy.RequestPolicy;


/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 15:35 2019/4/12
 */
public class SearchOrdersByFiltersParam extends Request<SearchOrdersByFiltersResult> {

    private FlipKartOrderFilter filter;
    private FlipKartPagination pagination;
    private FlipKartSort sort;

    public SearchOrdersByFiltersParam() {
        super();
        apiId = new APIId("v2/orders","search");
        httpMethod = RequestPolicy.HttpMethodPolicy.POST;
    }

    public FlipKartOrderFilter getFilter() {
        return filter;
    }

    public void setFilter(FlipKartOrderFilter filter) {
        this.filter = filter;
        super.addAddtionalParams("filter",filter);
    }

    public FlipKartPagination getPagination() {
        return pagination;
    }

    public void setPagination(FlipKartPagination pagination) {
        this.pagination = pagination;
        super.addAddtionalParams("pagination",pagination);
    }

    public FlipKartSort getSort() {
        return sort;
    }

    public void setSort(FlipKartSort sort) {
        this.sort = sort;
        super.addAddtionalParams("sort",sort);
    }

    @Override
    public String toString() {
        return "SearchOrdersParam{" +
                "filter=" + filter +
                ", pagination=" + pagination +
                ", sort=" + sort +
                '}';
    }
}
