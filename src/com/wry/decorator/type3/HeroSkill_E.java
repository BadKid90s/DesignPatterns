package com.wry.decorator.type3;

/**
 * 具体的装饰类
 */
public class HeroSkill_E extends HeroSkill {

    public HeroSkill_E(Hero hero, String name) {
        super(hero, name);
    }

    @Override
    public String laernSkill() {
        System.out.println("学习了E技能:" + name);
        return super.laernSkill() + "\t" + name;
    }
}
