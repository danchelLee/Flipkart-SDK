package com.sw.param.listing;

import java.math.BigDecimal;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 15:25 2019/4/8
 */
public class FlipKartLocation {
    /**
     * 通过Onboarding API获取的位置ID
     */
    private String id;
    /**
     * 控制locations的产品实现。如果禁用，则不会从此位置完成订单。
     */
    private FlipKartLocationStatus status;
    /**
     * Locations的可用库存
     */
    private BigDecimal inventory;

    private BigDecimal pending_inventory;

    public FlipKartLocation() {
    }

    public FlipKartLocation(String id, FlipKartLocationStatus status, BigDecimal inventory) {
        this.id = id;
        this.status = status;
        this.inventory = inventory;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public FlipKartLocationStatus getStatus() {
        return status;
    }

    public void setStatus(FlipKartLocationStatus status) {
        this.status = status;
    }

    public BigDecimal getInventory() {
        return inventory;
    }

    public void setInventory(BigDecimal inventory) {
        this.inventory = inventory;
    }

    public BigDecimal getPending_inventory() {
        return pending_inventory;
    }

    public void setPending_inventory(BigDecimal pending_inventory) {
        this.pending_inventory = pending_inventory;
    }

    @Override
    public String toString() {
        return "FlipKartLocation{" +
                "id='" + id + '\'' +
                ", status=" + status +
                ", inventory=" + inventory +
                ", pending_inventory=" + pending_inventory +
                '}';
    }

    public enum FlipKartLocationStatus {
        ENABLED("ENABLED",(byte)1),
        DISABLED("DISABLED",(byte)0);

        public String description;
        public byte status;

        FlipKartLocationStatus(String description, byte status) {
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
}
