package com.wry.patterns.mediator.type1;

/**
 * 文本框组件-具体同事类
 */
public class TextBox extends Component {
    public TextBox(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void update() {
        System.out.println("客户信息增加成功后文本框清空。");
    }
    public void setText() {
        System.out.println("文本框显示：小龙女。");
    }

}
