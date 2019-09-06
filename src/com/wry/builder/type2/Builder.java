package com.wry.builder.type2;

/**
 * 抽象 Builder
 */
public abstract class Builder {

    abstract void buildBoard(String board);

    abstract void buildDisplay(String display);

    abstract void buildOs();

    abstract Computer build();

}