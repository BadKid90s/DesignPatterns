package com.wry.principle.inversion.dataconversion.remould;

public  class DataFormat extends DataConversion {
    private String data;

    public DataFormat() {
    }

    public DataFormat(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
