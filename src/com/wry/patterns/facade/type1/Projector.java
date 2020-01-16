package com.wry.patterns.facade.type1;

/**
 * 投影仪 类
 */
public class Projector {
    private static Projector instance = new Projector();

    private Projector() {
    }

    public static Projector getInstance() {
        return instance;
    }

    public void open() {
        System.out.println("Projector open");
    }

    public void off() {
        System.out.println("Projector OFF");
    }

    public void focus() {
        System.out.println("Projector is focus");
    }
}
