package com.sw.param.listing;

public enum ShippingProvider {
    FLIPKART("FLIPKART",(byte)1),
    SELLER("SELLER",(byte)2),
    FLIPKART_SELLER("FLIPKART_SELLER",(byte)3);

    public String description;
    public byte status;

    ShippingProvider(String description, byte status){
        this.description = description;
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }
}
