package com.morning.star.bean;

import java.io.Serializable;

/**
 * Created by lenovo on 2017/8/10.
 */
public class RelationBean implements Serializable {
    
    private String tohomeField;

    private String hyField;

    private String tohomeTable;

    private String hyTable;

    public String getTohomeField() {
        return tohomeField;
    }

    public void setTohomeField(String tohomeField) {
        this.tohomeField = tohomeField;
    }

    public String getHyField() {
        return hyField;
    }

    public void setHyField(String hyField) {
        this.hyField = hyField;
    }

    public String getTohomeTable() {
        return tohomeTable;
    }

    public void setTohomeTable(String tohomeTable) {
        this.tohomeTable = tohomeTable;
    }

    public String getHyTable() {
        return hyTable;
    }

    public void setHyTable(String hyTable) {
        this.hyTable = hyTable;
    }
}
