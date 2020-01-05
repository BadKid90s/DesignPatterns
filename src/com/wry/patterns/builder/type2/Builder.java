package com.wry.patterns.builder.type2;

/**
 * 抽象 Builder
 */
public abstract class Builder {
    protected  Computer computer;

    abstract void buildBoard();

    abstract void buildDisplay();

    abstract void buildOs();

    public Computer getResult(){
        return computer;
    }
}
