package com.wry.principle.inversion.dataconversion.remould;

public class XmlData extends DataFormat {
    public XmlData() {
        super();
        System.out.print("----------【XML】------------");
    }

    public XmlData(String data) {
        super(data);
        System.out.print("----------【XML】------------");
    }
}
