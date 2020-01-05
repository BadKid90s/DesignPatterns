package com.wry.patterns.factory.abstractfactory.type.pizzafactory;

import com.wry.patterns.factory.abstractfactory.type.pizza.Pizza;

public interface AbsPizzaFactory {
    Pizza createPizz(String pizzaType);
}
