package com.wry.patterns.bridge.type1;

public class ClamshellPhone extends Phone {


    public ClamshellPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void open() {
        System.out.println("翻盖手机");
        brand.open();
    }

    @Override
    public void close() {
        System.out.println("翻盖手机");

        brand.close();
    }

    @Override
    public void call() {
        System.out.println("翻盖手机");

        brand.call();
    }
}
