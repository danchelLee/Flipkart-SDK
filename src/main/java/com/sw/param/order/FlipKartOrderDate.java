package com.sw.param.order;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 15:36 2019/4/12
 */
public class FlipKartOrderDate {
    private String fromDate;
    private String toDate;

    public FlipKartOrderDate() {
    }

    public FlipKartOrderDate(String fromDate, String toDate) {
        this.fromDate = fromDate;
        this.toDate = toDate;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    @Override
    public String toString() {
        return "FlipKartOrderDate{" +
                "fromDate='" + fromDate + '\'' +
                ", toDate='" + toDate + '\'' +
                '}';
    }
}
