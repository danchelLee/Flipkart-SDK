package com.sw.param.shipment;

import com.sw.param.listing.FlipKartErrorInfo;
import com.sw.param.order.FlipKartInvoice;

import java.io.InputStream;
import java.util.Arrays;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 18:09 2019/4/15
 */
public class DownloadInvoicesForShipmentResult {
    private InputStream inputStream;
    private FlipKartInvoice[] invoices;
    private String error;
    private String error_description;
    private String message;
    private FlipKartErrorInfo[] errors;

    public DownloadInvoicesForShipmentResult() {
    }

    public InputStream getInputStream() {
        return inputStream;
    }

    public void setInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    public FlipKartInvoice[] getInvoices() {
        return invoices;
    }

    public void setInvoices(FlipKartInvoice[] invoices) {
        this.invoices = invoices;
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
        return "DownloadInvoicesForShipmentResult{" +
                "inputStream=" + inputStream +
                ", invoices=" + Arrays.toString(invoices) +
                ", error='" + error + '\'' +
                ", error_description='" + error_description + '\'' +
                ", message='" + message + '\'' +
                ", errors=" + Arrays.toString(errors) +
                '}';
    }
}
