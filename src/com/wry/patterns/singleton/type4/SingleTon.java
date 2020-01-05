package com.wry.patterns.singleton.type4;

//懒汉模式（线程安全）
public class SingleTon {
    //私有化构造器
    private SingleTon() {
    }

    private static SingleTon instance;

    //提供一个静态方法当使用方法时创建对象
    public static synchronized SingleTon getInstance() {
        if (instance == null) {
            instance = new SingleTon();
        }
        return instance;
    }

}
//优点：可以实现懒加载,线程安全
//缺点：同步方法，代价太大

