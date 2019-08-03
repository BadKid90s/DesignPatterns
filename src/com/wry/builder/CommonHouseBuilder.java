package com.wry.builder;

public class CommonHouseBuilder implements IHouseBuilder {
    House house = new House();

    @Override
    public void buildBasic() {
        house.setName("普通房子");
    }

    @Override
    public void buildWalls() {
        house.setWall("普通房子的墙壁");
        house.setHight("10M");
    }

    @Override
    public void buildRoofed() {
        house.setRoof("普通房子的屋顶");
    }

    @Override
    public House getHours() {
        return house;
    }
}
