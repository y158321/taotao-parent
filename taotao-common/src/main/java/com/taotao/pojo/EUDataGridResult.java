package com.taotao.pojo;

import java.util.List;

/**
 * Created by Administrator on 2018/5/2.
 */
public class EUDataGridResult {

    private long total;
    private List<?> rows;

    public long getTotal() {
        return total;
    }

    public List<?> getRows() {
        return rows;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }
}