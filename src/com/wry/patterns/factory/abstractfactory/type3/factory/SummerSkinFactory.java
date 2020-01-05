package com.wry.patterns.factory.abstractfactory.type3.factory;

import com.wry.patterns.factory.abstractfactory.type3.product.*;

//Summer皮肤工厂：具体工厂
public class SummerSkinFactory implements SkinFactory {
    public Button createButton() {
        return new SummerButton();
    }

    public TextField createTextField() {
        return new SummerTextField();
    }

    public ComboBox createComboBox() {
        return new SummerComboBox();
    }
}
