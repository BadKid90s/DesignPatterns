package com.wry.principle.inversion.dataconversion.primeval;

public class XmlData extends DataConversion {
    private String data;

    public XmlData(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
