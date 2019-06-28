package com.sw.param.listing;

public enum ProcurementType {
    REGULAR("REGULAR",(byte)1),
    EXPRESS("EXPRESS",(byte)2),
    INTERNATIONAL("INTERNATIONAL",(byte)3),
    MADE_TO_ORDER("MADE_TO_ORDER",(byte)4),
    DOMESTIC("DOMESTIC",(byte)5);

    public String description;
    public byte status;

    ProcurementType(String description, byte status) {
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
