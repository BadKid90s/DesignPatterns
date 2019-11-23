package com.wry.principle.inversion.dataconversion.remould;

public class DatabaseSource extends AbstractSource {
    @Override
    public String getData() {
        return "从数据库获取数据";
    }
}
