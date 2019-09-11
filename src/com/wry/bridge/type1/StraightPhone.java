package com.wry.bridge.type1;

public class StraightPhone extends Phone {


    public StraightPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void open() {
        System.out.println("平板手机");
        brand.open();
    }

    @Override
    public void close() {
        System.out.println("平板手机");
        brand.close();
    }

    @Override
    public void call() {
        System.out.println("平板手机");
        brand.call();
    }
}
