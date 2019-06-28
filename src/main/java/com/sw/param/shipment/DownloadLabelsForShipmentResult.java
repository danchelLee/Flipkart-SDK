package com.sw.param.shipment;

import com.sw.param.listing.FlipKartErrorInfo;

import java.io.InputStream;
import java.util.Arrays;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 17:10 2019/4/15
 */
public class DownloadLabelsForShipmentResult {
    private InputStream inputStream;
    private String error;
    private String error_description;
    private String message;
    private FlipKartErrorInfo[] errors;

    public DownloadLabelsForShipmentResult(){

    }

    public InputStream getInputStream() {
        return inputStream;
    }

    public void setInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getError_description() {
        return error_description;
    }

    public void setError_description(String error_description) {
        this.error_description = error_description;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public FlipKartErrorInfo[] getErrors() {
        return errors;
    }

    public void setErrors(FlipKartErrorInfo[] errors) {
        this.errors = errors;
    }

    @Override
    public String toString() {
        return "DownloadLabelsForShipmentResult{" +
                "inputStream=" + inputStream +
                ", error='" + error + '\'' +
                ", error_description='" + error_description + '\'' +
                ", message='" + message + '\'' +
                ", errors=" + Arrays.toString(errors) +
                '}';
    }
}
