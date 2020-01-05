package com.wry.patterns.decorator.type3;

/**
 * 刺客英雄类
 */
public abstract class AssassinHero implements Hero {
    protected String heroType;
    protected String name;

    public AssassinHero(String name) {
        this.heroType = "刺客";
        this.name = name;
    }

    public abstract String laernSkill();


}
