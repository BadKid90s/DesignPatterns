package com.wry.factory.factory2.mousefactory;

import com.wry.factory.factory2.mouse.DellMouse;
import com.wry.factory.factory2.mouse.Mouse;

/**
 * 戴尔鼠标工厂
 */
public class DellMouseFactory extends MouseFactory {
    @Override
    public Mouse createMouse() {
        return new DellMouse();
    }
}
