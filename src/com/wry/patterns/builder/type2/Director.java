package com.wry.patterns.builder.type2;

/**
 * 指挥者类，负责具体的构造 Computer
 */
public class Director {
    private Builder mBuilser = null;


    public Director(Builder builer) {
        this.mBuilser = builer;
    }


    public void construct() {
        mBuilser.buildDisplay();
        mBuilser.buildBoard();
        mBuilser.buildOs();
    }

    public Computer getResult() {
        return mBuilser.computer;
    }
}
