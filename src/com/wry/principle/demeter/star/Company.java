package com.wry.principle.demeter.star;

//媒体公司
public class Company {
    private String name;

    Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
