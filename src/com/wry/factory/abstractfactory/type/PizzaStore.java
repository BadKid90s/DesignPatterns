package com.wry.factory.abstractfactory.type;


import com.wry.factory.abstractfactory.type.order.OrderPizza;
import com.wry.factory.abstractfactory.type.pizzafactory.USAPizzaFactory;

public class PizzaStore {
    public static void main(String[] args) {
//        new OrderPizza(new LDPizzaFactory());
        new OrderPizza(new USAPizzaFactory());
    }
}
