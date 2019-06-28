package com.sw.param.order;

import java.util.Arrays;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 14:08 2019/4/15
 */
public class GetInvoiceDetailOrderResult {

    private FlipKartInvoice[] invoices;
    private String type;
    private String code;
    private String message;

    public GetInvoiceDetailOrderResult() {
    }

    public FlipKartInvoice[] getInvoices() {
        return invoices;
    }

    public void setInvoices(FlipKartInvoice[] invoices) {
        this.invoices = invoices;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "GetInvoiceDetailOrderResult{" +
                "invoices=" + Arrays.toString(invoices) +
                ", type='" + type + '\'' +
                ", code='" + code + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
