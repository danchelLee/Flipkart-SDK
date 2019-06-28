package com.sw.param.order;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 14:36 2019/4/12
 */
public class FlipKartForm {
    /**
     * 与货件关联的物品的名称。
     */
    private String name;
    /**
     * 链接到政府门户网站，了解可以生成特定表格的位置。
     */
    private String link;
    /**
     * 是或否表示Flipkart为上述表格生成的表格。
     */
    private Boolean automated;
    /**
     * 表示表单生成的状态。状态可以是以下一个（NOT-CREATED，IN-PROGRESS，COMPLETED和FAILED）
     */
    private String status;

    /**
     * 从政府门户获得的ACK编号特别是手动填写
     */
    private String ackNumber;

    public FlipKartForm() {
    }

    public FlipKartForm(String name, String link, Boolean automated, String status, String ackNumber) {
        this.name = name;
        this.link = link;
        this.automated = automated;
        this.status = status;
        this.ackNumber = ackNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Boolean getAutomated() {
        return automated;
    }

    public void setAutomated(Boolean automated) {
        this.automated = automated;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAckNumber() {
        return ackNumber;
    }

    public void setAckNumber(String ackNumber) {
        this.ackNumber = ackNumber;
    }

    @Override
    public String toString() {
        return "FlipKartForm{" +
                "name='" + name + '\'' +
                ", link='" + link + '\'' +
                ", automated=" + automated +
                ", status='" + status + '\'' +
                ", ackNumber='" + ackNumber + '\'' +
                '}';
    }
}
