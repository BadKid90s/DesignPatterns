package com.wry.principle.singeresponsibiliy.vehicle;

public class SingleResponsibiliy2 {

    public static void main(String[] args) {
        RoadVehicel r= new RoadVehicel();
        r.run("小汽车");
        AirVehicel a= new AirVehicel();
        a.run("飞机");
        WaterVehicel w= new WaterVehicel();
        w.run("轮船");
    }
}
//遵守单一职责，
//类分解，改动较大
class  RoadVehicel {
    public void run(String cehicel) {
        System.out.println(cehicel + "在公路上跑.....");
    }
}

class  AirVehicel {
    public void run(String cehicel) {
        System.out.println(cehicel + "在天上飞.....");
    }
}

class  WaterVehicel {
    public void run(String cehicel) {
        System.out.println(cehicel + "在谁里跑.....");
    }
}
