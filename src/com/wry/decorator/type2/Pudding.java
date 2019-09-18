package com.wry.decorator.type2;

/**
 * 这杯奶茶使用了布丁材料
 * 布丁装饰类
 */
public class Pudding extends MilkTeaMaterial {
    public Pudding(DrinkMilkTea drinkMilkTea) {
        super(drinkMilkTea);
    }

    //重新父类计算价格的方法，在原本的基础上增加布丁的价格
    @Override
    public float getTotalPrice() {
        return super.getTotalPrice()+2;
    }
    //重新父类使用材料的方法，在原本的基础上增加布丁
    @Override
    public String useMaterial() {
        return super.useMaterial()+"--------布丁";
    }
}
