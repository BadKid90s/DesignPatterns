package com.wry.bridge.type1;

/**
 * 桥接模式的桥梁，组合品牌，提供抽象的方法
 */
public abstract class Phone {

    public Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    public abstract void open();

    public abstract void close();

    public abstract void call();

}
