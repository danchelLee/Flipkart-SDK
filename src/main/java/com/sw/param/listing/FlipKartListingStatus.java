package com.sw.param.listing;

public enum FlipKartListingStatus {
    ACTIVE("ACTIVE",(byte) 1),
    INACTIVE("INACTIVE",(byte)0);

    public String description;
    public byte status;

    FlipKartListingStatus(String description, byte status) {
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
