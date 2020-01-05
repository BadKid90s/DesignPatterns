package com.wry.patterns.builder.type2;

/**
 * 具体产品类 MacBook
 */
public class MacBook extends Computer {


    protected MacBook() {
    }

    @Override
    public void setOs() {
        mOs = "Mac OS X 12";
    }
}