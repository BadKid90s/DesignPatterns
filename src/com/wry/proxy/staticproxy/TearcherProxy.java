package com.wry.proxy.staticproxy;

/**
 * 代理对象的类，实现和被代理对象一样的接口（实现ITearcherDao接口）
 */
public class TearcherProxy implements ITearcherDao {
    //目标对象（以聚合的方式）
    ITearcherDao tearget;

    //通过构造器赋值
    public TearcherProxy(ITearcherDao tearget) {
        this.tearget = tearget;
    }

    @Override
    public void tearch() {
        System.out.println("静态代理开始------------");
        System.out.println("准备资料~~~~~~~~~~");
        tearget.tearch();
        System.out.println("课后辅导~~~~~~~~~~");
        System.out.println("静态代理结束------------");

    }
}
