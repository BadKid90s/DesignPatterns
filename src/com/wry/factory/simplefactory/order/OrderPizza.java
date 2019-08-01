package com.wry.factory.simplefactory.order;

import com.wry.factory.simplefactory.pizzafactory.PizzaFactory;
import com.wry.factory.simplefactory.pizza.Pizza;

import java.util.Scanner;

public class OrderPizza {

    private PizzaFactory pizzaFactory;

    public OrderPizza(PizzaFactory pizzaFactory) {
        this.pizzaFactory=pizzaFactory;
        createOderPizza();
    }

    public void createOderPizza(){
        Scanner sc=new Scanner(System.in);
        String pizzaType="";
        do {
            System.out.println("输入你需要订购的披萨名称：");
            pizzaType= sc.next();
            Pizza pizza = pizzaFactory.createPizza(pizzaType);
            if (pizza==null){
                System.out.println("没有你想要的~~~");
                break;
            }else {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }
        }while (true);


    }
}
