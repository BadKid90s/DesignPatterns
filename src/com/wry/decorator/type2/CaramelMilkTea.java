package com.wry.decorator.type2;

public class CaramelMilkTea implements DrinkMilkTea {
    //不含其他材料，价值12元
    @Override
    public float getTotalPrice() {
        return 12;
    }

    //核心材料：奶茶
    @Override
    public String useMaterial() {
        return "奶茶";
    }
}
