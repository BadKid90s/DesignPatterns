package com.wry.patterns.factory.simplefactory.type1;

import com.wry.patterns.factory.simplefactory.type1.order.OrderPizza;
import com.wry.patterns.factory.simplefactory.type1.pizzafactory.PizzaFactory;

public class PizzaStore {
    public static void main(String[] args) {
        new OrderPizza(new PizzaFactory());
    }
}
