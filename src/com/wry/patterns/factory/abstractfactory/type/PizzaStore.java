package com.wry.patterns.factory.abstractfactory.type;


import com.wry.patterns.factory.abstractfactory.type.order.OrderPizza;
import com.wry.patterns.factory.abstractfactory.type.pizzafactory.USAPizzaFactory;

public class PizzaStore {
    public static void main(String[] args) {
//        new OrderPizza(new LDPizzaFactory());
        new OrderPizza(new USAPizzaFactory());
    }
}
