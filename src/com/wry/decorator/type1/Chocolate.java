package com.wry.decorator.type1;

public class Chocolate extends Decorator{

    public Chocolate(Drink drink) {
        super(drink);
        setDesc("巧克力");
        setPrice(3.0f);
    }

}
