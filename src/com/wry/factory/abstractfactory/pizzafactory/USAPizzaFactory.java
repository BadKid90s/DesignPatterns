package com.wry.factory.abstractfactory.pizzafactory;

import com.wry.factory.abstractfactory.pizza.*;

public class USAPizzaFactory implements AbsPizzaFactory {
    @Override
    public Pizza createPizz(String pizzaType) {
      Pizza pizza=null;
       if (pizzaType.equals("pepper")){
            pizza=new USAPepperPizza();
            pizza.setName("美国-胡椒");
        }
        return pizza;
    }


}
