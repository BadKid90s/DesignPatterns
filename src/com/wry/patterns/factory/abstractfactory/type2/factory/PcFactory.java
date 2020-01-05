package com.wry.patterns.factory.abstractfactory.type2.factory;


import com.wry.patterns.factory.abstractfactory.type2.keybo.Keyboard;
import com.wry.patterns.factory.abstractfactory.type2.mouse.Mouse;

/**
 * 抽象工厂接口
 */
public interface PcFactory {
    /**
     * 创建鼠标
     *
     * @return
     */
    Mouse createMouse();

    /**
     * 创建键盘
     *
     * @return
     */
    Keyboard createKeyboard();
}
