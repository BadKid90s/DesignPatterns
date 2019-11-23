package com.wry.principle.inversion.dataconversion.primeval;

/**
 * 把数据转换为XML形式
 */
public class DataConversion {
    public XmlData conversionData(DatabaseSource source) {
        return new XmlData(source.getData()+"\t 转换为XML 数据");
    }
}
