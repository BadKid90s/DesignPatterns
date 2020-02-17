package com.wry.patterns.mediator.type1;

/**
 * 按钮组件-具体同事类
 */
public class Button extends Component {
    public Button(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void update() {
        System.out.println("点击了按钮");
    }
}
