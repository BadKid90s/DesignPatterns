package com.wry.principle.singeresponsibiliy.vehicle;

public class SingleResponsibiliy3 {

    public static void main(String[] args) {
        Vehicel2 r = new Vehicel2();
        r.roadRun("小汽车");
        r.airRun("飞机");
        r.waterRun("轮船");
    }
}
//在方法级别实现单一职责
class Vehicel2 {
    public void roadRun(String cehicel) {
        System.out.println(cehicel + "在公路上跑.....");
    }

    public void airRun(String cehicel) {
        System.out.println(cehicel + "在天上飞.....");
    }

    public void waterRun(String cehicel) {
        System.out.println(cehicel + "在谁里跑.....");
    }
}
