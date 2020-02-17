package com.wry.patterns.mediator.type1;

/**
 * 文本标签组件-具体同事类
 */
public class Label extends Component{
    public Label(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void update() {
        System.out.println("文本标签内容改变，客户信息总数加1。");
    }
}
