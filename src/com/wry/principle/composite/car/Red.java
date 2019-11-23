package com.wry.principle.composite.car;

public class Red implements Color {
    public Red() {
        setColor();
    }
    @Override
    public void setColor() {
        System.out.println("红色");
    }
}
