package com.wry.factory.abstractfactory.type.pizzafactory;

import com.wry.factory.abstractfactory.type.pizza.Pizza;

public interface AbsPizzaFactory {
    Pizza createPizz(String pizzaType);
}
