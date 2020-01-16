package com.wry.patterns.facade.type1;

/**
 * 立体声
 */
public class Stereo {

    private static Stereo instance = new Stereo();

    private Stereo() {
    }

    public static Stereo getInstance() {
        return instance;
    }

    public void up() {
        System.out.println("Stereo up");
    }

    public void down() {
        System.out.println("Stereo down");
    }


    public void open() {
        System.out.println("Stereo open");
    }

    public void off() {
        System.out.println("Stereo OFF");
    }
}
