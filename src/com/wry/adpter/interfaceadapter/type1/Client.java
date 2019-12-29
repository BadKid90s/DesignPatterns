package com.wry.adpter.interfaceadapter.type1;

public class Client {
    public static void main(String[] args) {
        new AbsAdapter() {
            @Override
            public void method1() {
                //实现需要适配的方法
                System.out.println("使用了M1 的方法！");
            }
        }.method1();
    }
}
