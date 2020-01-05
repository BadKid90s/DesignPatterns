package com.wry.patterns.singleton.type1;

//饿汉模式
public class SingleTon {
    //本类内部创建实例
    private final static SingleTon instance = new SingleTon();

    //私有化构造器
    private SingleTon() {
    }

    //提供共有的方法
    public static SingleTon getInstance() {
        return instance;
    }
}
//优点：写法比较简单，类装载的时候就创建实例，避免了线程同步问题
//缺点：类装载的时候就创建实例，不能实现懒加载，如果一直不使用这个实例造成内存浪费



















