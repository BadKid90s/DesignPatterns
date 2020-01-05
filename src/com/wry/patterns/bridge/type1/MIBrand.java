package com.wry.patterns.bridge.type1;

public class MIBrand implements Brand {

    private String name = "小米手机";

    @Override
    public void open() {
        System.out.println(name + "开机~~~");
    }

    @Override
    public void close() {
        System.out.println(name + "关机~~~");

    }

    @Override
    public void call() {
        System.out.println(name + "打电话··~~~");

    }
}
