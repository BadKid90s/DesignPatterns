package com.wry.patterns.factory.simplefactory.type1.pizza;

public class CheessPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备奶酪披萨的原材料！");
    }
}
