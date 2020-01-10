package com.wry.patterns.decorator.type4;

/**
 * 滚动条装饰类：具体装饰类
 */
public class ScrollBarDecorator extends ComponentDecorator {
    /**
     * 注入抽象构件类型的对象
     *
     * @param component
     */
    public ScrollBarDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        super.display();
        this.setScrollBar();
    }

    private void setScrollBar() {
        System.out.println("为构件增加滚动条！");
    }
}
