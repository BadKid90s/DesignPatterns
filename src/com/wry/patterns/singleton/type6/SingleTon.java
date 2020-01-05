package com.wry.patterns.singleton.type6;

//静态内部类
public class SingleTon {
    //私有化构造器
    private SingleTon() {
    }

    //静态内部类
    private static class SingleTonInstance {
        //类的静态属性只会在第一次加载类的时候初始化，jvm虚拟机保证线程安全
        private static final SingleTon INSTANCE = new SingleTon();
    }

    //提供一个静态方法当使用方法时创建对象
    public static SingleTon getInstance() {
        return SingleTonInstance.INSTANCE;
    }

}
//优点：可以实现懒加载,线程安全，效率提供
//推荐使用

