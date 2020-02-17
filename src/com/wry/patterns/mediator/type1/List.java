package com.wry.patterns.mediator.type1;

/**
 * 列表组件-具体同事类
 */
public class List extends Component {
    public List(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void update() {
        System.out.println("表框增加一项：张无忌。");
    }

    public void select() {
        System.out.println("列表框选中项：小龙女。");
    }

}
