package com.wry.singleton.type7;

//枚举
public enum SingleTon {
    INSTAANCE;

    public void sayOK() {
        System.out.println("ok");
    }

}
//优点：可以实现懒加载,线程安全，效率提供,还能防止反序列化重新创建对象
//推荐使用

