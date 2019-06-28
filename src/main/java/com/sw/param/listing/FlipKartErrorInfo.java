package com.sw.param.listing;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 19:20 2019/4/8
 */
public class FlipKartErrorInfo {
    private String severity;
    private String code;
    private String description;
    private String path;
    private String type;
    private String message;
    private String params;

    public FlipKartErrorInfo() {
    }

    public FlipKartErrorInfo(String severity, String code, String description, String path) {
        this.severity = severity;
        this.code = code;
        this.description = description;
        this.path = path;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    @Override
    public String toString() {
        return "FlipKartErrorInfo{" +
                "severity='" + severity + '\'' +
                ", code='" + code + '\'' +
                ", description='" + description + '\'' +
                ", path='" + path + '\'' +
                ", type='" + type + '\'' +
                ", message='" + message + '\'' +
                ", params='" + params + '\'' +
                '}';
    }
}
