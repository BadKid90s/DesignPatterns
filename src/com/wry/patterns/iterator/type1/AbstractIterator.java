package com.wry.patterns.iterator.type1;

public interface AbstractIterator {
    void next();

    boolean isLast();

    void previous();

    boolean isFirst();

    Object getNextItem();

    Object getPreviousItem();

}
