package com.wry.builder.type2;

/**
 * 计算机抽象类
 */
public abstract class Computer {
    //主板
    protected String mBoard;
    //屏幕
    protected String mDisplay;
    //系统
    protected String mOs;


    public void setBoard(String board){
        mBoard=board;
    }

    public void setDisplay(String display) {
        this.mDisplay = display;
    }


    public abstract void setOs() ;


    @Override
    public String toString() {
        return "Computer{" +
                "mBoard='" + mBoard + '\'' +
                ", mDisplay='" + mDisplay + '\'' +
                ", mOs='" + mOs + '\'' +
                '}';
    }
}