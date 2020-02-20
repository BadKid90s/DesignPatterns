package com.wry.patterns.memento.type3;

/**
 * 原发器
 */
public class Originator {
    private int state;

    public Originator(int state) {
        this.state = state;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    /**
     * 备忘录
     */
    private class Memento implements MementoF {

        private int state;

        public Memento(int state) {
            this.state = state;
        }

        public int getState() {
            return state;
        }

        public void setState(int state) {
            this.state = state;
        }

    }

    public MementoF createMemento() {
        return (MementoF) new Memento(state);
    }

    public void retrieveMemento(MementoF mem) {
        this.state = ((Memento) mem).getState();
    }

    public void display() {
        System.out.println("state=" + state);
    }
}