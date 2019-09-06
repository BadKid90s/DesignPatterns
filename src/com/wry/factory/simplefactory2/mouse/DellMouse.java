package com.wry.factory.simplefactory2.mouse;

/**
 * 戴尔的鼠标
 */
public class DellMouse extends Mouse {
    @Override
    public void sayHi() {
        System.out.println("这是Dell(戴尔)的鼠标");
    }
}
