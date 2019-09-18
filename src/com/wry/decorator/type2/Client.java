package com.wry.decorator.type2;

public class Client {
    public static void main(String[] args) {
        //一杯奶茶
        DrinkMilkTea drinkMilkTea=new CaramelMilkTea();
        System.out.println("价格："+drinkMilkTea.getTotalPrice()+"\t 材料："+drinkMilkTea.useMaterial());
        //加入一份布丁
        drinkMilkTea= new Pudding(drinkMilkTea);
        System.out.println("价格："+drinkMilkTea.getTotalPrice()+"\t 材料："+drinkMilkTea.useMaterial());

        //加入一份青稞
        drinkMilkTea= new HighlandBarley(drinkMilkTea);
        System.out.println("价格："+drinkMilkTea.getTotalPrice()+"\t 材料："+drinkMilkTea.useMaterial());

        //再次加入一份青稞
        drinkMilkTea= new HighlandBarley(drinkMilkTea);
        System.out.println("价格："+drinkMilkTea.getTotalPrice()+"\t 材料："+drinkMilkTea.useMaterial());


    }
}
