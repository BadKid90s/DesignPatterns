package com.wry.factory.simplefactory.type3.chart;


//折线图类：具体产品类
public class LineChart implements  Chart{
    public LineChart() {
        System.out.println("创建·折线图");
    }

    @Override
    public void display() {
        System.out.println("显示·折线图");
    }
}
