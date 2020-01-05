package com.wry.patterns.adpter.objectadpter.type1;

public class Phone {

    public void charging(Voltage5V voltage5V) {
        int v = voltage5V.outPut5V();
        if (v == 5) {
            System.out.println("正在充电---》电压" + v + "V");
        } else {
            System.out.println("不能充电---》电压" + v + "V");
        }
    }
}
