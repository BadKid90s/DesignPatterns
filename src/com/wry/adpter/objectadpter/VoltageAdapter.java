package com.wry.adpter.objectadpter;

/**
 * 实现目标接口，以组合的方式进行数据转换
 */
public class VoltageAdapter  implements Voltage5V {
    private Voltage220V voltage220V=new Voltage220V();
    @Override
    public int outPut5V() {
        int voltage = voltage220V.outPut220();
        int dst=voltage/44;
        return dst;
    }
}
