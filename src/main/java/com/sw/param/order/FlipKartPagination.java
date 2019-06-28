package com.sw.param.order;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 11:28 2019/4/12
 */
public class FlipKartPagination {

    /**
     * 要在一个页面中显示的搜索结果数。最大尺寸为20
     */
    private Integer pageSize;

    public FlipKartPagination() {
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    @Override
    public String toString() {
        return "FlipKartPagination{" +
                "pageSize=" + pageSize +
                '}';
    }
}
