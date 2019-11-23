package com.wry.principle.demeter.star;

//明星
public class Star {
    private String name;

    Star(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
