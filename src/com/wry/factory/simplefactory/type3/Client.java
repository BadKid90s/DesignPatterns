package com.wry.factory.simplefactory.type3;

import com.wry.factory.simplefactory.type3.chart.Chart;
import com.wry.factory.simplefactory.type3.factory.ChartFactory;
import com.wry.utils.XMLUtil;

import java.util.Calendar;

public class Client {

    public static void main(String[] args) {
        Chart chart = ChartFactory.getChart("line");
        chart.display();
        chart = ChartFactory.getChart("pie");
        chart.display();
        System.out.println("---------------通过配置-----------------");
        //读取配置文件中的参数
        String type = XMLUtil.getChartType((Client.class).getResource("").getPath(),"config.xml","chartType");
        chart = ChartFactory.getChart(type);
        Calendar c = Calendar.getInstance();
    }
}
