package com.sw.param.order;

import java.io.InputStream;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 14:39 2019/4/13
 */
public class DownloadLabelsForOrderItemResult {

    private InputStream inputStream;

    public DownloadLabelsForOrderItemResult() {
    }

    public InputStream getInputStream() {
        return inputStream;
    }

    public void setInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    @Override
    public String toString() {
        return "DownloadLabelsForOrderItemResult{" +
                "inputStream=" + inputStream +
                '}';
    }
}
