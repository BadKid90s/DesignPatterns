package com.wry.adpter.classadapter;

/**
 * 继承源类，实现目标接口 ，进行数据转换
 */
public class VoltageAdapter extends Voltage220 implements Voltage5V {

    @Override
    public int outPut5V() {
        int voltage = outPut220();
        int dst=voltage/44;
        return dst;
    }
}