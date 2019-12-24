package com.wry.factory.methodfactory.type1;

import com.wry.factory.methodfactory.type1.mouse.Mouse;
import com.wry.factory.methodfactory.type1.mousefactory.DellMouseFactory;
import com.wry.factory.methodfactory.type1.mousefactory.HPMouseFactory;
import com.wry.factory.methodfactory.type1.mousefactory.MouseFactory;


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
