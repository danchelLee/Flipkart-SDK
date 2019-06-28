package com.sw.param.order;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 18:21 2019/4/11
 */
public class FlipKartDate {
    /**
     * 开始时间
     */
    private String from;
    /**
     * 结束时间
     */
    private String to;

    private String before;

    private String after;

    public FlipKartDate() {
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getBefore() {
        return before;
    }

    public void setBefore(String before) {
        this.before = before;
    }

    public String getAfter() {
        return after;
    }

    public void setAfter(String after) {
        this.after = after;
    }

    @Override
    public String toString() {
        return "FlipKartDate{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", before='" + before + '\'' +
                ", after='" + after + '\'' +
                '}';
    }
}
