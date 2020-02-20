package com.wry.patterns.memento.type2;

import java.util.ArrayList;
import java.util.HashMap;

public class MementoCaretaker2 {
    //定义一个集合来存储多个备忘录(如果是一个对象建议采用ArrayList)
    private ArrayList mementolist = new ArrayList();
    //多个对象就用HashMap 和 ArrayList 组合使用,object 表示对象，ArrayList存放多个备忘录对象
    //private HashMap<Object,ArrayList> map=new HashMap<>();

    public ChessmanMemento getMemento(int i) {
        return (ChessmanMemento) mementolist.get(i);
    }

    public void setMemento(ChessmanMemento memento) {
        mementolist.add(memento);
    }

}
