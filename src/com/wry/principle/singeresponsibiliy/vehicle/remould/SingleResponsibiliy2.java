package com.wry.principle.singeresponsibiliy.vehicle.remould;

public class SingleResponsibiliy2 {

    public static void main(String[] args) {
        RoadVehicel r = new RoadVehicel();
        r.run("小汽车");
        AirVehicel a = new AirVehicel();
        a.run("飞机");
        WaterVehicel w = new WaterVehicel();
        w.run("轮船");
    }
}

