package com.wry.patterns.observer.type2;

/**
 * 抽象观察类
 */
public interface Observer {
    String getName();

    void setName(String name);

    void help(); //声明支援盟友方法

    void beAttacked(AllyControlCenter acc); //声明遭受攻击方法
}
