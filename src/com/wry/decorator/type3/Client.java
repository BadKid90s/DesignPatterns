package com.wry.decorator.type3;

public class Client {
    public static void main(String[] args) {
        //创建一个英雄
        Hero hero = new Timor();
        //学习Q技能
        hero = new HeroSkill_Q(hero, "致盲吹箭");
        System.out.println(hero.laernSkill());

        //学习W技能
        hero = new HeroSkill_W(hero, "小莫快跑");
        System.out.println(hero.laernSkill());

        //学习E技能
        hero = new HeroSkill_E(hero, "毒性射击");
        System.out.println(hero.laernSkill());

        //学习R技能
        hero = new HeroSkill_R(hero, "种蘑菇");
        System.out.println(hero.laernSkill());

    }
}
