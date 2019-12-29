package com.wry.decorator.type1;

public class Client {
    public static void main(String[] args) {
        Drink order = new LongBlack();
        System.out.println(order.getCost() + "-----" + order.getDescription());

        order = new Milk(order);
        System.out.println(order.getCost() + "-----" + order.getDescription());
    }
}
