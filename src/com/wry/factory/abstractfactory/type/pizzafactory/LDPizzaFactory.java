package com.wry.factory.abstractfactory.type.pizzafactory;

import com.wry.factory.abstractfactory.type.pizza.*;

public class LDPizzaFactory implements AbsPizzaFactory {
    @Override
    public Pizza createPizz(String pizzaType) {
      Pizza pizza=null;
        if (pizzaType.equals("greek")){
            pizza=new LDGreekPizza();
            pizza.setName("伦敦-希腊");
        }
        else if (pizzaType.equals("cheess")){
            pizza=new LDCheessPizza();
            pizza.setName("伦敦-奶酪");
        }  else if (pizzaType.equals("pepper")){
            pizza=new LDPepperPizza();
            pizza.setName("伦敦-胡椒");
        }
        return pizza;
    }


}
