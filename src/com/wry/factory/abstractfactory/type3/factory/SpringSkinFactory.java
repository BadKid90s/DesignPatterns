package com.wry.factory.abstractfactory.type3.factory;

import com.wry.factory.abstractfactory.type3.product.*;

//Spring皮肤工厂：具体工厂
public class SpringSkinFactory implements SkinFactory {
    public Button createButton() {
        return new SpringButton();
    }

    public TextField createTextField() {
        return new SpringTextField();
    }

    public ComboBox createComboBox() {
        return new SpringComboBox();
    }
}
