package com.wry.factory.abstractfactory2.factory;


import com.wry.factory.abstractfactory2.keybo.Keyboard;
import com.wry.factory.abstractfactory2.mouse.Mouse;

/**
 * 抽象工厂接口
 */
public interface PcFactory {
    /**
     * 创建鼠标
     * @return
     */
    Mouse createMouse();

    /**
     * 创建键盘
     * @return
     */
    Keyboard createKeyboard();
}
