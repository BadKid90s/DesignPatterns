package com.wry.patterns.decorator.type3;

/**
 * 具体的装饰类
 */
public class HeroSkill_W extends HeroSkill {

    public HeroSkill_W(Hero hero, String name) {
        super(hero, name);
    }

    @Override
    public String laernSkill() {
        System.out.println("学习了W技能:" + name);
        return super.laernSkill() + "\t" + name;

    }
}
