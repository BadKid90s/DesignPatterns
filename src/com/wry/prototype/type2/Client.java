package com.wry.prototype.type2;


import java.util.ArrayList;
import java.util.List;

/**
 * 原型模式创建10个相同的对象
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        List<Sheep> list = new ArrayList<>();
        Grass food = new Grass("小草", "green");
        Sheep sheep = new Sheep("duoli", 18, "red", food);
        list.add(sheep);
        Sheep sheep2 = (Sheep) sheep.clone();
        list.add(sheep2);
        Sheep sheep3 = (Sheep) sheep.clone();
        list.add(sheep3);
        Sheep sheep4 = (Sheep) sheep.clone();
        list.add(sheep4);
        Sheep sheep5 = (Sheep) sheep.clone();
        list.add(sheep5);


        for (Sheep s : list) {
            System.out.println(s + " hashCode=" + s.hashCode());
        }
    }
}
