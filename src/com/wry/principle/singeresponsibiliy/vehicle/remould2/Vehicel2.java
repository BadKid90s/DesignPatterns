package com.wry.principle.singeresponsibiliy.vehicle.remould2;

//在方法级别实现单一职责
public class Vehicel2 {
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
