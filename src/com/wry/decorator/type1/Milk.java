package com.wry.decorator.type1;

public class Milk extends Decorator {
    public Milk(Drink drink) {
        super(drink);
        setDesc("牛奶");
        setPrice(3.0f);
    }
}
