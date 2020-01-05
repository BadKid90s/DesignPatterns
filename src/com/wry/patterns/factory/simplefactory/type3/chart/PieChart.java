package com.wry.patterns.factory.simplefactory.type3.chart;


//饼状图类：具体产品类
public class PieChart implements  Chart{
    public PieChart() {
        System.out.println("创建·饼状图");
    }

    @Override
    public void display() {
        System.out.println("显示·饼状图");
    }
}
