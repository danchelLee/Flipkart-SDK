package com.sw.param.shipment;

import com.sw.client.APIId;
import com.sw.client.Request;
import com.sw.client.policy.RequestPolicy;
import com.sw.param.order.FlipKartPagination;
import com.sw.param.order.FlipKartSort;

/**
 * @Author: Dc Lee
 * @Descpription: 使用特定的过滤搜索货件
 * {
 *   "filter": {
 *     "serviceProfiles": [
 *       "OrderItemServiceProfile"
 *     ],
 *     "dispatchByDate": {
 *       "fromDate": "DateTime",
 *       "toDate": "DateTime"
 *     },
 *     "cancellationType": "Optional",
 *     "type": "",
 *     "dispatchAfterDate": {
 *       "fromDate": "DateTime",
 *       "toDate": "DateTime"
 *     },
 *     "states": [
 *       "OrderItemStatus"
 *     ],
 *     "dispatchServiceTiers": "Optional",
 *     "locationId": "",
 *     "modifiedDate": {
 *       "fromDate": "DateTime",
 *       "toDate": "DateTime"
 *     },
 *     "shipmentTypes": [
 *       "ShipmentType"
 *     ],
 *     "sku": [
 *       ""
 *     ],
 *     "orderDate": {
 *       "fromDate": "DateTime",
 *       "toDate": "DateTime"
 *     },
 *     "cancellationDate": {
 *       "fromDate": "DateTime",
 *       "toDate": "DateTime"
 *     }
 *   },
 *   "pagination": {
 *     "pageSize": "int"
 *   },
 *   "sort": {
 *     "field": "dispatchByDate",
 *     "order": "asc"
 *   }
 * }
 * @Date: 17:39 2019/4/11
 */
public class SearchShipmentsByFiltersParam extends Request<SearchShipmentsByFiltersResult> {

    private FlipKartShipmentsFilters filter;
    private FlipKartPagination pagination;
    private FlipKartSort sort;

    public SearchShipmentsByFiltersParam(){
        super();
        apiId = new APIId("v3/shipments","filter");
        httpMethod = RequestPolicy.HttpMethodPolicy.POST;
    }

    public FlipKartShipmentsFilters getFilter() {
        return filter;
    }

    public void setFilter(FlipKartShipmentsFilters filter) {
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
        return "SearchShipmentsByFiltersParam{" +
                "filter=" + filter +
                ", pagination=" + pagination +
                ", sort=" + sort +
                '}';
    }
}
