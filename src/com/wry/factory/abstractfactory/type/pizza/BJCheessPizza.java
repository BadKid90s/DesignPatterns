package com.wry.factory.abstractfactory.type.pizza;

public class BJCheessPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备"+name+"披萨的原材料！");
    }
}
