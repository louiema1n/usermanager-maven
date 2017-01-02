package com.lm.usermanager.bean;

import java.util.List;

/**
 * EasyUI通用分页查询结果
 * @author xtztx
 *
 */
public class EasyUIResult {

    private Long total;
    
    private List<?> rows;
    
    

    public EasyUIResult() {
        super();
    }

    public EasyUIResult(Long total, List<?> rows) {
        super();
        this.total = total;
        this.rows = rows;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }
    
    
}
