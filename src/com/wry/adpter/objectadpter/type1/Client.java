package com.wry.adpter.objectadpter.type1;

public class Client {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.charging(new VoltageAdapter());
    }
}