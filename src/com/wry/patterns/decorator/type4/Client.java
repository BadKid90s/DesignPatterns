package com.wry.patterns.decorator.type4;

public class Client {
    public static void main(String[] args) {
        Component textBox = new TextBox();
        textBox.display();

        System.out.println("---------开始装饰---------");

        Component textBoxSB = new BlackBorderDecorator(textBox);
        textBoxSB.display();

        System.out.println("---------二次装饰---------");

        Component textBoxSB2=new ScrollBarDecorator(textBoxSB);
        textBoxSB2.display();
    }

}
