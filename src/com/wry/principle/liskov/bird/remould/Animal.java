package com.wry.principle.liskov.bird.remould;


/**
 * 动物类
 */
public class Animal {
    private double runSpeed;

    public void setRunSpeed(double runSpeed) {
        this.runSpeed = runSpeed;
    }

    public double getRunTime(double distance) {
        return distance / runSpeed;
    }
}
