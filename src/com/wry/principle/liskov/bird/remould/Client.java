package com.wry.principle.liskov.bird.remould;



public class Client {
    public static void main(String[] args) {
        Animal bird1 = new Bird();
        Animal bird2 = new BrownKiwi();
        bird1.setRunSpeed(120);
        bird2.setRunSpeed(120);
        System.out.println("如果距离300公里：");
        try {
            System.out.println("燕子将飞行" + bird1.getRunTime(300) + "小时.");
            System.out.println("几维鸟将奔跑" + bird2.getRunTime(300) + "小时。");
        } catch (Exception err) {
            System.out.println("发生错误了!");
        }
    }
}
