package com.wry.principle.singeresponsibiliy;

public class SingleResponsibiliy1 {

    public static void main(String[] args) {
        Vehicel v = new Vehicel();
        v.run("小汽车");
        v.run("飞机");
        v.run("轮船");
    }
}

//违反职责单一原则
class  Vehicel {
    public void run(String cehicel) {
        System.out.println(cehicel + "在公路上跑");
    }
}
