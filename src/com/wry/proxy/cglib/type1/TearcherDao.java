package com.wry.proxy.cglib.type1;


import java.util.ArrayList;
import java.util.List;

/**
 * 被代理的对象的类 Cglib代理不需要实现接口
 */
public class TearcherDao {
    public void tearch() {
        System.out.println("正在教书··········");
    }

    public int studentNumber() {
        System.out.println("正在计算学生数量··········");
        return 1000;
    }

    public List<String> getStudent() {
        System.out.println("正在获取学生··········");
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add("学生-" + Math.random() + "_" + (i + 1));
        }
        return list;
    }
}
