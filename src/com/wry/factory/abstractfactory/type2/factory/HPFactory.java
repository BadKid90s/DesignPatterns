package com.wry.factory.abstractfactory.type2.factory;

import com.wry.factory.abstractfactory.type2.keybo.HPKeyboard;
import com.wry.factory.abstractfactory.type2.keybo.Keyboard;
import com.wry.factory.abstractfactory.type2.mouse.HPMouse;
import com.wry.factory.abstractfactory.type2.mouse.Mouse;

/**
 * HP 工厂
 */
public class HPFactory  implements PcFactory{
    @Override
    public Mouse createMouse() {
        return new HPMouse();
    }

    @Override
    public Keyboard createKeyboard() {
        return new HPKeyboard();
    }
}
