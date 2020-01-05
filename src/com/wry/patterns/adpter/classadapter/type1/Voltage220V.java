package com.wry.patterns.adpter.classadapter.type1;

public class Voltage220V {
    public int outPut220() {
        int src = 220;
        System.out.println("电压是：" + src + "V");
        return src;
    }
}
