package com.wry.proxy.staticproxy;

public class Client {
    public static void main(String[] args) {
        //创建目标对象
        ITearcherDao tearcherDao = new TearcherDaoImpl();
        //创建代理对象
        TearcherProxy tearcherProxy = new TearcherProxy(tearcherDao);
        //执行代理对象的方法
        tearcherProxy.tearch();
    }
}
