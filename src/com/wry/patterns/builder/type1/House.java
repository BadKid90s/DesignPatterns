package com.wry.patterns.builder.type1;

/**
 * 房子
 */
public class House {
    //名称
    private String name;
    //高度
    private String hight;
    //墙壁
    private String wall;
    //屋顶
    private String roof;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHight() {
        return hight;
    }

    public void setHight(String hight) {
        this.hight = hight;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getRoof() {
        return roof;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    @Override
    public String toString() {
        return "House{" +
                "name='" + name + '\'' +
                ", hight='" + hight + '\'' +
                ", wall='" + wall + '\'' +
                ", roof='" + roof + '\'' +
                '}';
    }
}
