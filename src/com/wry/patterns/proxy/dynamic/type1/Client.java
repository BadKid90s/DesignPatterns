package com.wry.patterns.proxy.dynamic.type1;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        ITearcherDao tearcherDao = new TearcherDaoImpl();
        ITearcherDao proxyInstance = (ITearcherDao) new ProxyFactory(tearcherDao).getProxyInstance();
        proxyInstance.tearch();
        System.out.println("----------------华丽的分割线------------------");
        int number = proxyInstance.studentNumber();
        System.out.println(number);
        System.out.println("----------------华丽的分割线------------------");
        List<String> studentList = proxyInstance.getStudent();
        for (String s : studentList) {
            System.out.println(s);
        }
    }
}
