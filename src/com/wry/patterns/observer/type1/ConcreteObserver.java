package com.wry.patterns.observer.type1;

/**
 * 具体的观察者
 * @author wry
 */
public class ConcreteObserver implements ObServer {
    @Override
    public void updata() {
        //具体响应代码
        System.out.println("数据发生改变："+System.currentTimeMillis());
    }
}
