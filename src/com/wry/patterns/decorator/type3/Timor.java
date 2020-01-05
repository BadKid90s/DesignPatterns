package com.wry.patterns.decorator.type3;

public class Timor extends AssassinHero {

    public Timor() {
        super("提莫");
    }

    @Override
    public String laernSkill() {
        return "姓名：" + super.name + "\t 类型：" + super.heroType + "\t 学会的技能：";
    }
}