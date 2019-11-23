package com.wry.principle.composite.car;

public class Client {
    public static void main(String[] args) {
        Car car=new RedGasolineCar(new Red());
        car.move();
    }
}
