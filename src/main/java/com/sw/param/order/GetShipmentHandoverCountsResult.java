package com.sw.param.order;

import com.sw.param.listing.FlipKartErrorInfo;

import java.math.BigDecimal;
import java.util.Arrays;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 15:52 2019/4/16
 */
public class GetShipmentHandoverCountsResult {
    private FlipKartDate pickUpDate;
    /**
     * 货件属于Multi pack货件
     */
    private Boolean isMps;
    /**
     * 可分发货件所属的供应商代码
     */
    private String vendorGroupCode;
    /**
     * 该供应商的可分发货件数量
     */
    private BigDecimal count;
    private FlipKartErrorInfo error;
    private String message;
    private FlipKartErrorInfo[] errors;
    private String code;

    public GetShipmentHandoverCountsResult() {
    }

    public FlipKartDate getPickUpDate() {
        return pickUpDate;
    }

    public void setPickUpDate(FlipKartDate pickUpDate) {
        this.pickUpDate = pickUpDate;
    }

    public Boolean getMps() {
        return isMps;
    }

    public void setMps(Boolean mps) {
        isMps = mps;
    }

    public String getVendorGroupCode() {
        return vendorGroupCode;
    }

    public void setVendorGroupCode(String vendorGroupCode) {
        this.vendorGroupCode = vendorGroupCode;
    }

    public BigDecimal getCount() {
        return count;
    }

    public void setCount(BigDecimal count) {
        this.count = count;
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "GetShipmentHandoverCountsResult{" +
                "pickUpDate=" + pickUpDate +
                ", isMps=" + isMps +
                ", vendorGroupCode='" + vendorGroupCode + '\'' +
                ", count=" + count +
                ", error=" + error +
                ", message='" + message + '\'' +
                ", errors=" + Arrays.toString(errors) +
                ", code='" + code + '\'' +
                '}';
    }
}
