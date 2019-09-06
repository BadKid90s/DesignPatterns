package com.wry.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 代理工厂创建代理对象
 */
public class ProxyFactory {
    //目标对象
    private Object tearget;

    public ProxyFactory(Object tearget) {
        this.tearget = tearget;
    }

    /**
     * 获取代理对象
     * @return
     */
    public Object getProxyInstance(){
        /**
         *  Proxy.newProxyInstance(
         *  目标（被代理）对象使用的类加载器，
         *  目标（被代理）对象实现的接口集合
         *  调用处理器 ，
         *  )
         */
        return Proxy.newProxyInstance(
                tearget.getClass().getClassLoader(),
                tearget.getClass().getInterfaces(),
                new InvocationHandler() {
                    /**
                     *
                     * @param proxy  代理类代理对象（被代理对象）tearget 的真实代理对象
                     * @param method 代理类代理对象（被代理对象）调用的方法
                     * @param args   代理类代理对象（被代理对象）调用的方法的参数
                     * @return
                     * @throws Throwable
                     */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("jdkAPI代理开始~~~~");

                        Object invokeObj = method.invoke(tearget, args);

                        System.out.println("jdkAPI代理结束~~~~");
                        return invokeObj;
                    }
                }
        );
    }
}
