package com.wry.patterns.decorator.type1;

public abstract class Drink {
    private String desc;

    private float price = 0.0f;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    //计算费用的方法，子类去实现
    public abstract float getCost();

    public abstract String getDescription();
}
