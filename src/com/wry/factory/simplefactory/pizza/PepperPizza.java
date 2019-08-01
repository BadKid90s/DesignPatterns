package com.wry.factory.simplefactory.pizza;

public class PepperPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备胡椒披萨的原材料！");
    }
}
