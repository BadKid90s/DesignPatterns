package com.wry.patterns.facade.type1;

/**
 * DVD 类
 */
public class DVDPlayer {
    private static DVDPlayer instance=new DVDPlayer();

    private DVDPlayer(){}

    public static DVDPlayer getInstance() {
        return instance;
    }

    public void open(){
        System.out.println("DVD open");
    }
    public void off(){
        System.out.println("DVD OFF");
    }
    public void play(){
        System.out.println("DVD playing");
    }
}
