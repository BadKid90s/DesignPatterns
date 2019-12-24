package com.wry.proxy.dynamic.type1;

import java.util.ArrayList;
import java.util.List;

/**
 * 被代理的对象的类，实现ITearcherDao接口
 */
public class TearcherDaoImpl implements ITearcherDao {
    @Override
    public void tearch() {
        System.out.println("正在教书··········");
    }

    @Override
    public int studentNumber() {
        System.out.println("正在计算学生数量··········");
        return 1000;
    }

    @Override
    public List<String> getStudent() {
        System.out.println("正在获取学生··········");
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add("学生-" + Math.random() + "_" + (i + 1));
        }
        return list;
    }
}
