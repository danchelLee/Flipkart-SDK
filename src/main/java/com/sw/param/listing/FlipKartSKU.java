package com.sw.param.listing;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 11:37 2019/4/8
 */
public class FlipKartSKU {
    private String sku;
    private String product_id;
    private FlipKartPrice price;
    private FlipKartTax tax;
    private FlipKartListingStatus listing_status;
    private FlipKartShippingFees shipping_fees;
    private FlipKartFulfillmentProfile fulfillment_profile;
    private FlipKartFulfillment fulfillment;
    private List<FlipKartPackage> packages;
    private List<FlipKartLocation> locations;
    private FlipKartAddressLabel address_label;
    private FlipKartDatingLabel  dating_label;
    private FlipKartDimensions dimensions;
    private String listing_id;
    private FlipKartOrderPolicy order_policy;

    public FlipKartSKU() {
    }

    public FlipKartSKU(String sku, String product_id, FlipKartPrice price, FlipKartTax tax, FlipKartListingStatus listing_status, FlipKartShippingFees shipping_fees, FlipKartFulfillmentProfile fulfillment_profile, FlipKartFulfillment fulfillment, List<FlipKartPackage> packages, List<FlipKartLocation> locations, FlipKartAddressLabel address_label, FlipKartDatingLabel dating_label, FlipKartDimensions dimensions, String listing_id, FlipKartOrderPolicy order_policy) {
        this.sku = sku;
        this.product_id = product_id;
        this.price = price;
        this.tax = tax;
        this.listing_status = listing_status;
        this.shipping_fees = shipping_fees;
        this.fulfillment_profile = fulfillment_profile;
        this.fulfillment = fulfillment;
        this.packages = packages;
        this.locations = locations;
        this.address_label = address_label;
        this.dating_label = dating_label;
        this.dimensions = dimensions;
        this.listing_id = listing_id;
        this.order_policy = order_policy;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public FlipKartPrice getPrice() {
        return price;
    }

    public void setPrice(FlipKartPrice price) {
        this.price = price;
    }

    public FlipKartTax getTax() {
        return tax;
    }

    public void setTax(FlipKartTax tax) {
        this.tax = tax;
    }

    public FlipKartListingStatus getListing_status() {
        return listing_status;
    }

    public void setListing_status(FlipKartListingStatus listing_status) {
        this.listing_status = listing_status;
    }

    public FlipKartShippingFees getShipping_fees() {
        return shipping_fees;
    }

    public void setShipping_fees(FlipKartShippingFees shipping_fees) {
        this.shipping_fees = shipping_fees;
    }

    public FlipKartFulfillmentProfile getFulfillment_profile() {
        return fulfillment_profile;
    }

    public void setFulfillment_profile(FlipKartFulfillmentProfile fulfillment_profile) {
        this.fulfillment_profile = fulfillment_profile;
    }

    public FlipKartFulfillment getFulfillment() {
        return fulfillment;
    }

    public void setFulfillment(FlipKartFulfillment fulfillment) {
        this.fulfillment = fulfillment;
    }

    public List<FlipKartPackage> getPackages() {
        return packages;
    }

    public void setPackages(List<FlipKartPackage> packages) {
        this.packages = packages;
    }

    public List<FlipKartLocation> getLocations() {
        return locations;
    }

    public void setLocations(List<FlipKartLocation> locations) {
        this.locations = locations;
    }

    public FlipKartAddressLabel getAddress_label() {
        return address_label;
    }

    public void setAddress_label(FlipKartAddressLabel address_label) {
        this.address_label = address_label;
    }

    public FlipKartDatingLabel getDating_label() {
        return dating_label;
    }

    public void setDating_label(FlipKartDatingLabel dating_label) {
        this.dating_label = dating_label;
    }

    public FlipKartDimensions getDimensions() {
        return dimensions;
    }

    public void setDimensions(FlipKartDimensions dimensions) {
        this.dimensions = dimensions;
    }

    public String getListing_id() {
        return listing_id;
    }

    public void setListing_id(String listing_id) {
        this.listing_id = listing_id;
    }

    public FlipKartOrderPolicy getOrder_policy() {
        return order_policy;
    }

    public void setOrder_policy(FlipKartOrderPolicy order_policy) {
        this.order_policy = order_policy;
    }

    @Override
    public String toString() {
        return "FlipKartSKU{" +
                "sku='" + sku + '\'' +
                ", product_id='" + product_id + '\'' +
                ", price=" + price +
                ", tax=" + tax +
                ", listing_status=" + listing_status +
                ", shipping_fees=" + shipping_fees +
                ", fulfillment_profile=" + fulfillment_profile +
                ", fulfillment=" + fulfillment +
                ", packages=" + packages +
                ", locations=" + locations +
                ", address_label=" + address_label +
                ", dating_label=" + dating_label +
                ", dimensions=" + dimensions +
                ", listing_id='" + listing_id + '\'' +
                ", order_policy=" + order_policy +
                '}';
    }
}
