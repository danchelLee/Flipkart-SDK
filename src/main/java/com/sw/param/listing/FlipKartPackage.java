package com.sw.param.listing;

import java.math.BigDecimal;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 12:59 2019/4/8
 */
public class FlipKartPackage {

    private String id;
    private String name;
    private FlipKartDimensions dimensions;
    private BigDecimal weight;
    private String description;
    private FlipKartHandling handling;
    private FlipKartNotionalValue notional_value;

    public FlipKartPackage() {
    }

    public FlipKartPackage(String id, String name, FlipKartDimensions dimensions, BigDecimal weight, String description, FlipKartHandling handling, FlipKartNotionalValue notional_value) {
        this.id = id;
        this.name = name;
        this.dimensions = dimensions;
        this.weight = weight;
        this.description = description;
        this.handling = handling;
        this.notional_value = notional_value;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FlipKartDimensions getDimensions() {
        return dimensions;
    }

    public void setDimensions(FlipKartDimensions dimensions) {
        this.dimensions = dimensions;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public FlipKartHandling getHandling() {
        return handling;
    }

    public void setHandling(FlipKartHandling handling) {
        this.handling = handling;
    }

    public FlipKartNotionalValue getNotional_value() {
        return notional_value;
    }

    public void setNotional_value(FlipKartNotionalValue notional_value) {
        this.notional_value = notional_value;
    }

    @Override
    public String toString() {
        return "FlipKartPackage{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dimensions=" + dimensions +
                ", weight=" + weight +
                ", description='" + description + '\'' +
                ", handling=" + handling +
                ", notional_value=" + notional_value +
                '}';
    }
}
