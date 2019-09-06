package com.wry.builder.type2;

/**
 * 指挥者类，负责具体的构造 Computer
 */
public class Director {
    Builder mBuilser = null;


    public Director(Builder builer) {
        this.mBuilser = builer;
    }


    public void construct(String board, String display) {
        mBuilser.buildDisplay(display);
        mBuilser.buildBoard(board);
        mBuilser.buildOs();
    }
}