package com.wry.patterns.decorator.type4;

/**
 * 黑色边框装饰类：具体装饰类
 */
public class BlackBorderDecorator extends ComponentDecorator {
    /**
     * 注入抽象构件类型的对象
     *
     * @param component
     */
    public BlackBorderDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        super.display();
        this.setBlackBorder();
    }

    private void setBlackBorder() {
        System.out.println("为构件增加黑色边框！");
    }

}
