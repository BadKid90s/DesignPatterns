package com.wry.factory.methodfactory.type1.mousefactory;

import com.wry.factory.methodfactory.type1.mouse.DellMouse;
import com.wry.factory.methodfactory.type1.mouse.Mouse;

/**
 * 戴尔鼠标工厂
 */
public class DellMouseFactory extends MouseFactory {
    @Override
    public Mouse createMouse() {
        return new DellMouse();
    }
}
