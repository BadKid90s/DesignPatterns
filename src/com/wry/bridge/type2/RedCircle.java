package com.wry.bridge.type2;

public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("正在画圆形[ color: red, radius: "
                + radius + ", x: " + x + ", " + y + "]");
    }
}