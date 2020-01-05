package com.wry.patterns.decorator.type2;

/**
 * 这杯奶茶具体使用了什么材料，这个我们不清楚
 * 因此将材料单独抽取出来，做成抽象类，让子类去设计定义具体的材料
 * 但是单独定义没有意义，需要将材料放进奶茶中，才能体现出价值
 * 因此需要实现最顶层的接口
 */
public abstract class MilkTeaMaterial implements DrinkMilkTea {
    //将顶层以构造参数形式传递
    private DrinkMilkTea drinkMilkTea;

    public MilkTeaMaterial(DrinkMilkTea drinkMilkTea) {
        this.drinkMilkTea = drinkMilkTea;
    }

    //重新顶层接口的获取价格方法
    @Override
    public float getTotalPrice() {
        return drinkMilkTea.getTotalPrice();
    }

    //重新顶层接口的获取使用材料方法
    @Override
    public String useMaterial() {
        return drinkMilkTea.useMaterial();
    }
}
