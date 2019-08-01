package com.wry.factory.simplefactory;

import com.wry.factory.simplefactory.order.OrderPizza;
import com.wry.factory.simplefactory.pizzafactory.PizzaFactory;

public class PizzaStore {
    public static void main(String[] args) {
        new OrderPizza(new PizzaFactory());
    }
}
