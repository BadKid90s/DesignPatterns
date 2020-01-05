package com.wry.patterns.prototype.type1;

import java.util.ArrayList;
import java.util.List;

/**
 * 原型模式创建10个相同的对象
 */
public class Client {
    public static void main(String[] args) {
        List<Sheep> list = new ArrayList<>();
        Sheep sheep = new Sheep("duoli", 18, "red");
        list.add(sheep);
        Sheep sheep2 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        list.add(sheep2);
        Sheep sheep3 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        list.add(sheep3);
        Sheep sheep4 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        list.add(sheep4);
        Sheep sheep5 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        list.add(sheep5);


        for (Sheep s : list) {
            System.out.println(s);
        }
    }
}
