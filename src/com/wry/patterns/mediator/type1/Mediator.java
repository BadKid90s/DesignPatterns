package com.wry.patterns.mediator.type1;

import java.util.HashMap;

/**
 * 抽象中介者
 */
public abstract class Mediator {
    //用于存储同事对象
    protected HashMap<String,Component> componentHashMap=new HashMap<>();

    //注册方法，用于增加同事对象
    public void register(Component component) {
        componentHashMap.put(component.getName(),component);
    }

    public abstract void componentChanged(Component component);
}
