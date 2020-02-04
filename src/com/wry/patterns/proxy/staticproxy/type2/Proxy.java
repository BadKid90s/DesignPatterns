package com.wry.patterns.proxy.staticproxy.type2;

/**
 * 代理类
 */
public class Proxy implements Subject {
    private RealSubject realSubject;

    public void before() {
        System.out.println("访问真实主题之前的预处理。");
    }

    public void after() {
        System.out.println("访问真实主题之后的后续处理。");
    }

    @Override
    public void display() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        before();
        realSubject.display();
        after();
    }
}