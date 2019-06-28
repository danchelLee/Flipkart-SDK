package com.sw.param.listing;

import java.math.BigDecimal;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 15:11 2019/4/8
 */
public class FlipKartDimensions {
    private BigDecimal length;
    private BigDecimal breadth;
    private BigDecimal height;
    /**
     * 重量
     */
    private BigDecimal weight;

    public FlipKartDimensions() {
    }

    public FlipKartDimensions(BigDecimal length, BigDecimal breadth, BigDecimal height,BigDecimal weight) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
        this.weight = weight;
    }

    public BigDecimal getLength() {
        return length;
    }

    public void setLength(BigDecimal length) {
        this.length = length;
    }

    public BigDecimal getBreadth() {
        return breadth;
    }

    public void setBreadth(BigDecimal breadth) {
        this.breadth = breadth;
    }

    public BigDecimal getHeight() {
        return height;
    }

    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "FlipKartDimensions{" +
                "length=" + length +
                ", breadth=" + breadth +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
