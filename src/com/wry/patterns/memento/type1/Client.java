package com.wry.patterns.memento.type1;

public class Client {
    public static void main(String[] args) {
        Originator originator=new Originator();
        originator.setState("状态1");
        originator.disPlay();
        //创建备忘录对象
        Memento memento = originator.createMemento();
        Caretaker caretaker=new Caretaker();
        caretaker.setMemento(memento);

        originator.setState("状态2");
        originator.disPlay();
        System.out.println("进行撤销操作。。。");
        originator.restoreMemento(caretaker.getMemento());
        originator.disPlay();
    }
}
