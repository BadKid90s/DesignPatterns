package com.wry.patterns.factory.simplefactory.type2.mousefactory;

import com.wry.patterns.factory.simplefactory.type2.mouse.DellMouse;
import com.wry.patterns.factory.simplefactory.type2.mouse.HPMouse;
import com.wry.patterns.factory.simplefactory.type2.mouse.Mouse;

/**
 * 鼠标工厂类
 */
public class MouseFactory {

    /**
     * 创建鼠标
     *
     * @param i 0:Dell鼠标 1：HP 鼠标
     * @return
     */
    public static Mouse createMouse(int i) {
        Mouse mouse = null;
        switch (i) {
            case 0:
                mouse = new DellMouse();
                break;
            case 1:
                mouse = new HPMouse();
                break;

        }
        return mouse;
    }
}
