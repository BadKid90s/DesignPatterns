package com.wry.decorator.type2;

/**
 * 定义一个顶层喝奶茶的接口
 */
public interface DrinkMilkTea {
    //总共花了多少钱
    float getTotalPrice();
    //这杯奶茶使用了什么材料
    String useMaterial();
}
