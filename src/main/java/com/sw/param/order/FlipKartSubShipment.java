package com.sw.param.order;

import com.sw.param.listing.FlipKartDimensions;
import com.sw.param.listing.FlipKartPackage;
import com.sw.param.shipment.FlipKartCourierDetail;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 14:39 2019/4/12
 */
public class FlipKartSubShipment {
    /**
     * 特定子货件的主要标识符。
     */
    private String subShipmentId;
    /**
     * 一个子货件内的包裹清单
     */
    private List<FlipKartPackage> packages;
    /**
     * 特定包的主要标识符
     */
    private String packageId;
    /**
     * 分货数量
     */
    private BigDecimal quantity;
    /**
     * 包的标题
     */
    private String packageTitle;
    /**
     * 包的SKU
     */
    private String packageSku;

    private FlipKartDimensions dimensions;
    private FlipKartDimensions shipmentDimensions;
    private FlipKartCourierDetail courierDetails;

    public FlipKartSubShipment() {
    }

    public String getSubShipmentId() {
        return subShipmentId;
    }

    public void setSubShipmentId(String subShipmentId) {
        this.subShipmentId = subShipmentId;
    }

    public List<FlipKartPackage> getPackages() {
        return packages;
    }

    public void setPackages(List<FlipKartPackage> packages) {
        this.packages = packages;
    }

    public String getPackageId() {
        return packageId;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public String getPackageTitle() {
        return packageTitle;
    }

    public void setPackageTitle(String packageTitle) {
        this.packageTitle = packageTitle;
    }

    public String getPackageSku() {
        return packageSku;
    }

    public void setPackageSku(String packageSku) {
        this.packageSku = packageSku;
    }

    public FlipKartDimensions getDimensions() {
        return dimensions;
    }

    public void setDimensions(FlipKartDimensions dimensions) {
        this.dimensions = dimensions;
    }

    public FlipKartDimensions getShipmentDimensions() {
        return shipmentDimensions;
    }

    public void setShipmentDimensions(FlipKartDimensions shipmentDimensions) {
        this.shipmentDimensions = shipmentDimensions;
    }

    public FlipKartCourierDetail getCourierDetails() {
        return courierDetails;
    }

    public void setCourierDetails(FlipKartCourierDetail courierDetails) {
        this.courierDetails = courierDetails;
    }

    @Override
    public String toString() {
        return "FlipKartSubShipment{" +
                "subShipmentId='" + subShipmentId + '\'' +
                ", packages=" + packages +
                ", packageId='" + packageId + '\'' +
                ", quantity=" + quantity +
                ", packageTitle='" + packageTitle + '\'' +
                ", packageSku='" + packageSku + '\'' +
                ", dimensions=" + dimensions +
                ", shipmentDimensions=" + shipmentDimensions +
                ", courierDetails=" + courierDetails +
                '}';
    }
}
