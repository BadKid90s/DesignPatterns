package com.wry.patterns.mediator.type1;

/**
 * 抽象组件类：抽象同事类
 */
public abstract class Component {
    protected Mediator mediator;
    private String name;

    public Component(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
        this.mediator.register(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Mediator getMediator(){
        return this.mediator;
    }
    //转发调用
    public void changed() {
        mediator.componentChanged(this);
    }

    public abstract void update();
}
