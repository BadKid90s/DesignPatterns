package com.wry.factory.abstractfactory2.factory;

import com.wry.factory.abstractfactory2.keybo.DellKeyboard;
import com.wry.factory.abstractfactory2.keybo.Keyboard;
import com.wry.factory.abstractfactory2.mouse.DellMouse;
import com.wry.factory.abstractfactory2.mouse.Mouse;

/**
 * Dell 工厂
 */
public class DellFactory implements PcFactory{
    @Override
    public Mouse createMouse() {
        return new DellMouse();
    }

    @Override
    public Keyboard createKeyboard() {
        return new DellKeyboard();
    }
}
