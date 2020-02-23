package com.wry.patterns.observer.type1;

/**
 * 目标
 *
 * @author wry
 */
public interface Subject {
    /**
     * 添加观察者
     *
     * @param obServer
     */
    void attach(ObServer obServer);

    /**
     * 移除观察者
     *
     * @param obServer
     */
    void detach(ObServer obServer);

    /**
     * 通知观察者
     */
    void notifyObserver();
}
