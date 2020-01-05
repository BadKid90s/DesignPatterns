package com.wry.patterns.decorator.type3;

/**
 * 具体的装饰类
 */
public class HeroSkill_R extends HeroSkill {

    public HeroSkill_R(Hero hero, String name) {
        super(hero, name);
    }

    @Override
    public String laernSkill() {
        System.out.println("学习了R技能:" + name);
        return super.laernSkill() + "\t" + name;

    }
}
