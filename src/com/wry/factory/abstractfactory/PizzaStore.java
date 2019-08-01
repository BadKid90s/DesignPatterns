package com.wry.factory.abstractfactory;


import com.wry.factory.abstractfactory.order.OrderPizza;
import com.wry.factory.abstractfactory.pizzafactory.BJPizzaFactory;
import com.wry.factory.abstractfactory.pizzafactory.LDPizzaFactory;
import com.wry.factory.abstractfactory.pizzafactory.USAPizzaFactory;
import com.wry.factory.simplefactory.pizzafactory.PizzaFactory;

public class PizzaStore {
    public static void main(String[] args) {
//        new OrderPizza(new LDPizzaFactory());
        new OrderPizza(new USAPizzaFactory());
    }
}
