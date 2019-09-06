package com.wry.builder.type1;

public class Client {
    public static void main(String[] args) {
       HouseDirecter houseDirecter = new HouseDirecter(new HightHouseBuilder());
        System.out.println(houseDirecter.getHouse().toString());
    }
}
