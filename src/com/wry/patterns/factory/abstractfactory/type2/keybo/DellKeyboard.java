package com.wry.patterns.factory.abstractfactory.type2.keybo;

/**
 * 戴尔的键盘
 */
public class DellKeyboard extends Keyboard {
    @Override
    public void sayHi() {
        System.out.println("这是Dell(戴尔)的键盘");
    }
}
