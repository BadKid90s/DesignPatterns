package com.wry.patterns.observer.type1;

public class Client {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        ObServer obServer = new ConcreteObserver();
        subject.attach(obServer);

        subject.notifyObserver();
        subject.notifyObserver();
    }
}
