package com.wry.factory.abstractfactory.type.order;

import com.wry.factory.abstractfactory.type.pizza.Pizza;
import com.wry.factory.abstractfactory.type.pizzafactory.AbsPizzaFactory;

import java.util.Scanner;

public class OrderPizza {

    private AbsPizzaFactory pizzaFactory;

    public OrderPizza(AbsPizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
        createOderPizza();
    }

    public void createOderPizza() {
        Scanner sc = new Scanner(System.in);
        String pizzaType = "";
        do {
            System.out.println("输入你需要订购的披萨名称：");
            pizzaType = sc.next();
            Pizza pizza = pizzaFactory.createPizz(pizzaType);
            if (pizza == null) {
                System.out.println("没有你想要的~~~");
                break;
            } else {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }
        } while (true);


    }
}
