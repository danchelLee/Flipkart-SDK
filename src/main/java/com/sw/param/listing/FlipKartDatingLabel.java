package com.sw.param.listing;

import java.math.BigDecimal;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 16:24 2019/4/8
 */
public class FlipKartDatingLabel {
    private BigDecimal mfg_date;
    private BigDecimal shelf_life;

    public FlipKartDatingLabel() {
    }

    public BigDecimal getMfg_date() {
        return mfg_date;
    }

    public void setMfg_date(BigDecimal mfg_date) {
        this.mfg_date = mfg_date;
    }

    public BigDecimal getShelf_life() {
        return shelf_life;
    }

    public void setShelf_life(BigDecimal shelf_life) {
        this.shelf_life = shelf_life;
    }

    @Override
    public String toString() {
        return "FlipKartDatingLabel{" +
                "mfg_date=" + mfg_date +
                ", shelf_life=" + shelf_life +
                '}';
    }
}
