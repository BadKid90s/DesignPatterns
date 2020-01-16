package com.wry.patterns.facade.type1;

/**
 *  爆米花 类
 */
public class Popcorn {
    private static Popcorn instance=new Popcorn();

    private Popcorn(){}

    public static Popcorn getInstance() {
        return instance;
    }

    public void on(){
        System.out.println("Popcorn on");
    }
    public void off(){
        System.out.println("Popcorn OFF");
    }
    public void pop(){
        System.out.println("DVD poping");
    }
}
