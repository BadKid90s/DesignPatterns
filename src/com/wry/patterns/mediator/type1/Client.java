package com.wry.patterns.mediator.type1;

public class Client {
    public static void main(String[] args) {
        Mediator mediator=new SubConcreteMediator();
        Component button=new Button(mediator,"button");
        Component list=new List(mediator,"list");
        Component comboBox=new ComboBox(mediator,"comboBox");
        Component textBox=new TextBox(mediator,"textBox");
        Component label=new Label(mediator,"label");

        button.changed();
        System.out.println("-----------------");
        list.changed();
    }
}
