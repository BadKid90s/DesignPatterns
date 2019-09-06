package com.wry.factory.factory2;

import com.wry.factory.factory2.mouse.Mouse;
import com.wry.factory.factory2.mousefactory.DellMouseFactory;
import com.wry.factory.factory2.mousefactory.HPMouseFactory;
import com.wry.factory.factory2.mousefactory.MouseFactory;


public class MouseClient {
    public static void main(String[] args) {
        //Dell
        Mouse mouse= getMouse(new DellMouseFactory());
        mouse.sayHi();

        //HP
        Mouse mouse2= getMouse(new HPMouseFactory());
        mouse2.sayHi();
    }

    /**
     * 获取鼠标实例
     * @param mouseFactory
     * @return
     */
    public static Mouse getMouse(MouseFactory mouseFactory){
        Mouse mouse = mouseFactory.createMouse();
        return  mouse;
    }
}
