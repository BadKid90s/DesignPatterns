package com.wry.factory.abstractfactory.pizzafactory;

import com.wry.factory.abstractfactory.pizza.BJCheessPizza;
import com.wry.factory.abstractfactory.pizza.BJGreekPizza;
import com.wry.factory.abstractfactory.pizza.BJPepperPizza;
import com.wry.factory.abstractfactory.pizza.Pizza;

public class BJPizzaFactory implements AbsPizzaFactory {
    @Override
    public Pizza createPizz(String pizzaType) {
      Pizza pizza=null;
        if (pizzaType.equals("greek")){
            pizza=new BJGreekPizza();
            pizza.setName("北京-希腊");
        }
        else if (pizzaType.equals("cheess")){
            pizza=new BJCheessPizza();
            pizza.setName("北京-奶酪");
        }  else if (pizzaType.equals("pepper")){
            pizza=new BJPepperPizza();
            pizza.setName("北京-胡椒");
        }
        return pizza;
    }


}
