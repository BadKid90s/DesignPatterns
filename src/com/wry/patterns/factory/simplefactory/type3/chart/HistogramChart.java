package com.wry.patterns.factory.simplefactory.type3.chart;


//柱状图类：具体产品类
public class HistogramChart  implements  Chart{
    public HistogramChart() {
        System.out.println("创建·柱状图");
    }

    @Override
    public void display() {
        System.out.println("显示·柱状图");
    }
}
