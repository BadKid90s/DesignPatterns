package com.wry.builder.type1;

/**
 * 指挥者
 */
public class HouseDirecter {
    private IHouseBuilder houseBuilder;

    public HouseDirecter(IHouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House getHouse() {
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.buildRoofed();
        return houseBuilder.getHours();
    }
}
