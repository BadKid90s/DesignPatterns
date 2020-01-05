package com.wry.patterns.decorator.type2;

/**
 * 这杯奶茶使用了青稞材料
 * 青稞装饰类
 */
public class HighlandBarley extends MilkTeaMaterial {
    public HighlandBarley(DrinkMilkTea drinkMilkTea) {
        super(drinkMilkTea);
    }


    //重新父类计算价格的方法，在原本的基础上增加青稞的价格
    @Override
    public float getTotalPrice() {
        return super.getTotalPrice() + 2;
    }

    //重新父类使用材料的方法，在原本的基础上增加青稞
    @Override
    public String useMaterial() {
        return super.useMaterial() + "--------青稞";
    }
}
