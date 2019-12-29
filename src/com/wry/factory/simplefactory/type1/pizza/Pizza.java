package com.wry.factory.simplefactory.type1.pizza;

public abstract class Pizza {
    public String name;

    public abstract void prepare();

    public void bake() {
        System.out.println(name + "披萨正在制作~~~~");
    }

    public void cut() {
        System.out.println(name + "披萨正在切割~~~~");
    }

    public void box() {
        System.out.println(name + "披萨正在打包~~~~");
    }

    public void setName(String name) {
        this.name = name;
    }
}
