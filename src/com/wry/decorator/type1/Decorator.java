package com.wry.decorator.type1;

public class Decorator extends Drink {
    private Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public float getCost() {
        return drink.getCost()+getPrice();
    }

    @Override
    public String getDescription() {
        return drink.getDescription()+"-------"+getDesc();
    }
}
