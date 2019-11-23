package com.wry.principle.composite.car;

public class Car {
    private Color color;

    public Car(Color color) {
        this.color = color;
    }

    public void move(){
        System.out.println("------汽油汽车-----");
    }
}
