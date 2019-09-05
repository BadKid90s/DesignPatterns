package com.wry.adpter.classadapter;

public class Client {
    public static void main(String[] args) {
        Phone p=new Phone();
        p.charging(new VoltageAdapter());
    }
}
