package com.sw.param.listing;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 15:52 2019/4/8
 */
public class FlipKartAddressDetail {
    private String nameAndAddress;

    public FlipKartAddressDetail() {
    }

    public FlipKartAddressDetail(String nameAndAddress) {
        this.nameAndAddress = nameAndAddress;
    }

    public String getNameAndAddress() {
        return nameAndAddress;
    }

    public void setNameAndAddress(String nameAndAddress) {
        this.nameAndAddress = nameAndAddress;
    }

    @Override
    public String toString() {
        return "FlipKartAddressDetail{" +
                "nameAndAddress='" + nameAndAddress + '\'' +
                '}';
    }
}
