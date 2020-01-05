package com.wry.patterns.builder.type2;

public class Client {
    public static void main(String[] args) {
        Builder builder = new MacBookBuilder();
        Director pcDirector = new Director(builder);
        pcDirector.construct();
        Computer computer = pcDirector.getResult();

        System.out.println(computer.toString());
    }
}
