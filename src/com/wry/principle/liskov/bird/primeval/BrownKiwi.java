package com.wry.principle.liskov.bird.primeval;

/**
 * 几维鸟类
 */
public class BrownKiwi extends Bird {
    //重写父类的方法，设置速度等于0
    @Override
    public void setFlySpeed(double flySpeed) {
        super.setFlySpeed(0);
    }
}
