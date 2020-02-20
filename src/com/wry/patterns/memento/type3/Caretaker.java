package com.wry.patterns.memento.type3;

/**
 * 负责人
 */
public class Caretaker {
    private MementoF mem;

    public MementoF getMem() {
        return mem;
    }

    public void setMem(MementoF mem) {
        this.mem = mem;
    }
}