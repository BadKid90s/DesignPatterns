package com.wry.factory.factory2.mousefactory;

import com.wry.factory.factory2.mouse.HPMouse;
import com.wry.factory.factory2.mouse.Mouse;

/**
 * 惠普鼠标工厂
 */
public class HPMouseFactory extends MouseFactory {
    @Override
    public Mouse createMouse() {
        return new HPMouse();
    }
}
