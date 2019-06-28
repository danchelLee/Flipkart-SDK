package com.sw.param.listing;

public enum FlipKartFulfillmentProfile {
    NON_FBF("NON_FBF",(byte)1),
    FBF_LITE("FB_LITE",(byte)2),
    FBF("FBF",(byte)3);


    public String description;
    public byte status;

    FlipKartFulfillmentProfile(String description, byte status) {
        this.description = description;
        this.status = status;
    }

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
