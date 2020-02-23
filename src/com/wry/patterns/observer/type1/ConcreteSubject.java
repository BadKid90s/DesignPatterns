package com.wry.patterns.observer.type1;


import java.util.ArrayList;
import java.util.List;

/**
 * 具体的目标类
 *
 * @author wry
 */
public class ConcreteSubject implements Subject {
    private List<ObServer> list = new ArrayList<>();

    @Override
    public void attach(ObServer obServer) {
        this.list.add(obServer);
    }

    @Override
    public void detach(ObServer obServer) {
        this.list.remove(obServer);
    }

    @Override
    public void notifyObserver() {
        for (ObServer obServer : list) {
            obServer.updata();
        }
    }
}
