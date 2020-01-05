package com.wry.patterns.decorator.type1;

public class Coffee extends Drink {

    @Override
    public float getCost() {
        return super.getPrice();
    }

    @Override
    public String getDescription() {
        return super.getDesc();
    }
}
