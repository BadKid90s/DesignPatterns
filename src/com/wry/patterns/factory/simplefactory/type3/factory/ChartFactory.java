package com.wry.patterns.factory.simplefactory.type3.factory;

import com.wry.patterns.factory.simplefactory.type3.chart.Chart;
import com.wry.patterns.factory.simplefactory.type3.chart.HistogramChart;
import com.wry.patterns.factory.simplefactory.type3.chart.LineChart;
import com.wry.patterns.factory.simplefactory.type3.chart.PieChart;

//图表工厂类：工厂类
public class ChartFactory {

    //静态工厂方法
    public static Chart getChart(String type) {
        Chart chart = null;
        if (type.equalsIgnoreCase("histogram")) {
            chart=new HistogramChart();
            System.out.println("设置柱状图");
        }else if (type.equalsIgnoreCase("pie")) {
            chart=new PieChart();
            System.out.println("设置饼状图");
        }
        else if (type.equalsIgnoreCase("line")) {
            chart=new LineChart();
            System.out.println("设置折线图");
        }
        return chart;
    }
}
