package com.wry.patterns.bridge.type1;

public class Client {
    public static void main(String[] args) {
        //品牌
        Brand brand = new MIBrand();
        //样式
        Phone phone = new StraightPhone(brand);
        phone.open();
        Phone phone2 = new ClamshellPhone(brand);
        phone2.open();
    }
}
