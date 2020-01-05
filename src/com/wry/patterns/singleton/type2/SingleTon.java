package com.wry.patterns.singleton.type2;

//饿汉模式
public class SingleTon {
    //通过静态代码块创建对象
    static {
        instance = new SingleTon();
    }

    //本类内部创建实例
    private static SingleTon instance;

    //私有化构造器
    private SingleTon() {
    }

    //提供共有的方法
    public static SingleTon getInstance() {
        return instance;
    }
}
