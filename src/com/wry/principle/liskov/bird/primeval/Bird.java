package com.wry.principle.liskov.bird.primeval;

/**
 * 鸟类
 */
public class Bird {
    protected double flySpeed;

    public void setFlySpeed(double flySpeed) {
        this.flySpeed = flySpeed;
    }

    public double getFlyTime(double distance) {
        return distance / flySpeed;
    }

}
