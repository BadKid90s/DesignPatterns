package com.wry.patterns.builder.type2;

/**
 * 具体的 Builder （MacBookBuilder）
 */
public class MacBookBuilder extends Builder {

    @Override
    void buildBoard() {
        computer.setBoard("英特尔主板");
    }

    @Override
    void buildDisplay() {
        computer.setDisplay("Retina显示器");
    }

    @Override
    void buildOs() {
        computer.setOs();
    }


}
