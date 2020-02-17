package com.wry.patterns.mediator.type1;

/**
 * 组合框组件-具体同事类
 */
public class ComboBox extends Component{
    public ComboBox(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void update() {
        System.out.println("组合框增加一项：张无忌。");
    }
    public void select() {
        System.out.println("组合框选中项：小龙女。");
    }

}
