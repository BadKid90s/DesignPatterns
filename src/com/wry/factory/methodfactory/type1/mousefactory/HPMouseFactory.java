package com.wry.factory.methodfactory.type1.mousefactory;

import com.wry.factory.methodfactory.type1.mouse.HPMouse;
import com.wry.factory.methodfactory.type1.mouse.Mouse;

/**
 * 惠普鼠标工厂
 */
public class HPMouseFactory extends MouseFactory {
    @Override
    public Mouse createMouse() {
        return new HPMouse();
    }
}
