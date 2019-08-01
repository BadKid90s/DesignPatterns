package com.wry.singleton.type3;

//懒汉模式（线程不安全）
public class SingleTon {
    //私有化构造器
    private SingleTon() {
    }

    private static SingleTon instance;
    //提供一个静态方法当使用方法时创建对象
    public static SingleTon getInstance() {
        if (instance == null) {
            instance = new SingleTon();
        }
        return instance;
    }

}
//优点：可以实现懒加载；
//缺点：在多线程中存在问题

