package com.wry.proxy.cglib.type1;


public class Client {
    public static void main(String[] args) {
        //创建目标对象
        TearcherDao tearcherDao = new TearcherDao();
        //获取代理对象，并且将目标对象传递给代理对象
        TearcherDao instance = (TearcherDao) new ProxyFactory(tearcherDao).getProxyInstance();
        instance.tearch();
    }
}
