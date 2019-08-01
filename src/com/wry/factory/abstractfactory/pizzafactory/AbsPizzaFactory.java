package com.wry.factory.abstractfactory.pizzafactory;

import com.wry.factory.abstractfactory.pizza.Pizza;

public interface AbsPizzaFactory {
    Pizza createPizz(String pizzaType);
}
