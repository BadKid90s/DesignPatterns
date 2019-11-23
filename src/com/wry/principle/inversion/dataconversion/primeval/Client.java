package com.wry.principle.inversion.dataconversion.primeval;

public class Client {
    public static void main(String[] args) {
        DatabaseSource databaseSource=new DatabaseSource();
        databaseSource.getData();

        DataConversion dataConversion=new DataConversion();
        XmlData xmlData = dataConversion.conversionData(databaseSource);
        System.out.println(xmlData.getData());
    }
}
