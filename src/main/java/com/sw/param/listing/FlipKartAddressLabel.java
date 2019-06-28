package com.sw.param.listing;

import java.util.List;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 15:40 2019/4/8
 */
public class FlipKartAddressLabel {
    private List<FlipKartAddressDetail> manufacturer_details;
    private List<FlipKartAddressDetail> importer_details;
    private List<FlipKartAddressDetail> packer_details;
    private List<String> countries_of_origin;

    public FlipKartAddressLabel() {
    }

    public FlipKartAddressLabel(List<FlipKartAddressDetail> manufacturer_details, List<FlipKartAddressDetail> importer_details, List<FlipKartAddressDetail> packer_details, List<String> countries_of_origin) {
        this.manufacturer_details = manufacturer_details;
        this.importer_details = importer_details;
        this.packer_details = packer_details;
        this.countries_of_origin = countries_of_origin;
    }

    public List<FlipKartAddressDetail> getManufacturer_details() {
        return manufacturer_details;
    }

    public void setManufacturer_details(List<FlipKartAddressDetail> manufacturer_details) {
        this.manufacturer_details = manufacturer_details;
    }

    public List<FlipKartAddressDetail> getImporter_details() {
        return importer_details;
    }

    public void setImporter_details(List<FlipKartAddressDetail> importer_details) {
        this.importer_details = importer_details;
    }

    public List<FlipKartAddressDetail> getPacker_details() {
        return packer_details;
    }

    public void setPacker_details(List<FlipKartAddressDetail> packer_details) {
        this.packer_details = packer_details;
    }

    public List<String> getCountries_of_origin() {
        return countries_of_origin;
    }

    public void setCountries_of_origin(List<String> countries_of_origin) {
        this.countries_of_origin = countries_of_origin;
    }

    @Override
    public String toString() {
        return "FlipKartAddressLabel{" +
                "manufacturer_details=" + manufacturer_details +
                ", importer_details=" + importer_details +
                ", packer_details=" + packer_details +
                ", countries_of_origin=" + countries_of_origin +
                '}';
    }
}
