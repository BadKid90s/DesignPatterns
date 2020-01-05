package com.wry.patterns.bridge.type2;

/**
 * 桥接模式的桥梁，以组合的方式引用DrawAPI
 */
public abstract class Shape {

    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}