package com.wry.patterns.proxy.cglib.type1;

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
     *
     * @return
     */
    public Object getProxyInstance() {
        //1.创建一个工具类
        Enhancer enhancer = new Enhancer();
        //2.设置父类
        enhancer.setSuperclass(tearget.getClass());
        //3.设置回调函数
        enhancer.setCallback(this);
        //4.创建子类对象，即代理对象
        return enhancer.create();

    }


    /**
     * 重写这个方法，会调用目标对象的方法
     * 所有生成的代理方法调用此方法，而不是原始方法。
     * 原始方法可以通过使用方法对象的法向反射调用，
     * 或者使用MethodProxy（更快）。
     *
     * @param o           “this”，代理类代理对象（被代理对象）
     * @param method      代理类代理对象（被代理对象）调用的方法
     * @param objects     代理类代理对象（被代理对象）参数数组；原语类型被包装
     * @param methodProxy 用于调用super（非截获方法）；可以调用 根据需要多次
     * @throws Throwable 可以抛出任何异常；如果是，则不会调用super方法
     * @返回与代理方法的签名兼容的任何值。返回void的方法将忽略此值。
     **/
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("Cglib代理模式-----开始");
        Object invoke = method.invoke(tearget, objects);
        System.out.println("Cglib代理模式-----结束");
        return invoke;
    }
}
