package com.wry.factory.simplefactory.type2;

import com.wry.factory.simplefactory.type2.mouse.Mouse;
import com.wry.factory.simplefactory.type2.mousefactory.MouseFactory;

public class MouseClient {
    public static void main(String[] args) {
        //Dell
        Mouse mouse = MouseFactory.createMouse(0);
        mouse.sayHi();

        //HP
        Mouse mouse2 = MouseFactory.createMouse(1);
        mouse2.sayHi();
    }
}
