package com.wry.patterns.builder.type1;

/**
 * 建造者接口
 */
public interface IHouseBuilder {
    void buildBasic();

    void buildWalls();

    void buildRoofed();

    House getHours();

}
