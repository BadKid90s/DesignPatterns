package com.wry.builder;

public class HightHouseBuilder implements IHouseBuilder {
    House house = new House();

    @Override
    public void buildBasic() {
        house.setName("高楼");
    }

    @Override
    public void buildWalls() {
        house.setWall("高楼的墙壁");
        house.setHight("1000M");
    }

    @Override
    public void buildRoofed() {
        house.setRoof("高楼的屋顶");
    }

    @Override
    public House getHours() {
        return house;
    }
}
