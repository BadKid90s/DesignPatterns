package com.wry.prototype.type2;

import java.io.*;

/**
 * 实现Cloneable接口重新克隆方法.实现Serializable接口实现序列化
 */
public class Sheep implements Serializable,Cloneable {
    private String name;
    private int age;
    private String color;

    private Grass food;

    public Sheep() {
    }

    public Sheep(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public Sheep(String name, int age, String color, Grass food) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.food = food;
    }

    public Grass getFood() {
        return food;
    }

    public void setFood(Grass food) {
        this.food = food;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", food=" + food +
                ", food.name=" + food.getName() +
                ", food.color='" + food.getColor() + '\'' +
                ", food.hashCode='" + food.hashCode() + '\'' +
                '}';
    }

//    /**
//     * 直接使用父类的克隆方法（基本数据类型和String类型都是实现深拷贝，引用数据类型是浅拷贝）
//     * @return
//     * @throws CloneNotSupportedException
//     */
//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }

//
//    /**
//     *
//     * 手动实现引用数据类型的克隆
//     * @return
//     * @throws CloneNotSupportedException
//     */
//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        Sheep sheep = (Sheep) super.clone();
//        Grass food = sheep.getFood();
//        sheep.setFood(new Grass(food.getName(), food.getColor()));
//        return sheep;
//    }


    /**
     * 通过序列化的方式实现深克隆
     *
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Sheep sheep = (Sheep) super.clone();

        ByteArrayOutputStream baos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bais = null;
        ObjectInputStream ois = null;

        Object object = null;
        try {
            baos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(baos);
            oos.writeObject(sheep);

            bais = new ByteArrayInputStream(baos.toByteArray());
            ois = new ObjectInputStream(bais);
            object = ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                oos.close();
                ois.close();
                baos.close();
                bais.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return object;
    }
}

class Grass  implements Serializable{
    private String name;
    private String color;

    public Grass() {
    }

    public Grass(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Grass{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
