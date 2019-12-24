package com.wry.proxy.cglib.type1;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 代理工厂创建代理对象
 */
public class ProxyFactory implements MethodInterceptor {
    //目标对象
    private Object tearget;

    public ProxyFactory(Object tearget) {
        this.tearget = tearget;
    }

    /**
     * 获取代理对象
     * @return
     */
    public Object getProxyInstance() {
        //1.创建一个工具类
        Enhancer enhancer=new Enhancer();
        //2.设置父类
        enhancer.setSuperclass(tearget.getClass());
        //3.设置回调函数
        enhancer.setCallback(this);
        //4.创建子类对象，即代理对象
        return enhancer.create();

    }

    //重写这个方法，会调用目标对象的方法
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("Cglib代理模式-----开始");
        Object invoke = method.invoke(tearget, objects);
        System.out.println("Cglib代理模式-----结束");
        return invoke;
    }
}
