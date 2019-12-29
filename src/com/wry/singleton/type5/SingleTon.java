package com.wry.singleton.type5;

//双重检查
public class SingleTon {
    //私有化构造器
    private SingleTon() {
    }

    private static volatile SingleTon instance;

    //提供一个静态方法当使用方法时创建对象
    public static SingleTon getInstance() {
        if (instance == null) {
            synchronized (SingleTon.class) {
                if (instance == null) {
                    instance = new SingleTon();
                }
            }
        }
        return instance;
    }

}
//优点：可以实现懒加载,线程安全，效率提供
//推荐使用

