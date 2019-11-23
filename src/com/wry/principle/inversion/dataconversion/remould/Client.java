package com.wry.principle.inversion.dataconversion.remould;

public class Client {
    public static void main(String[] args) {
        //数据库数据源
        AbstractSource dataSource = new DatabaseSource();
        dataSource.getData();
        DataConversion conversion = new DataConversion();
        //后期可通过配置文件动态配置类名
        DataFormat format = conversion.conversionData("com.wry.principle.inversion.dataconversion.remould.XmlData", dataSource);
        XmlData data = (XmlData) format;
        System.out.println(data.getData());
        //后期可通过配置文件动态配置类名
        format = conversion.conversionData("com.wry.principle.inversion.dataconversion.remould.XlstData", dataSource);
        XlstData data2 = (XlstData) format;
        System.out.println(data2.getData());

        //文本文件数据源
        dataSource = new TxtSource();
        //后期可通过配置文件动态配置类名
        format = conversion.conversionData("com.wry.principle.inversion.dataconversion.remould.XmlData", dataSource);
        data = (XmlData) format;
        System.out.println(data.getData());
        //后期可通过配置文件动态配置类名
        format = conversion.conversionData("com.wry.principle.inversion.dataconversion.remould.XlstData", dataSource);
        data2 = (XlstData) format;
        System.out.println(data2.getData());
    }
}
