package com.wry.decorator.type3;

/**
 * 抽象的英雄技能类，
 * 抽象的装饰类
 */
public class HeroSkill implements Hero {
    //英雄
    private Hero hero;
    //技能名称
    protected String name;

    public HeroSkill(Hero hero, String name) {
        this.hero = hero;
        this.name = name;
    }

    @Override
    public String laernSkill() {
        return hero.laernSkill();
    }
}
