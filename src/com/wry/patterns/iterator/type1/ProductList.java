package com.wry.patterns.iterator.type1;

import java.util.List;

public class ProductList extends AbstractObjectList {

    public ProductList(List objects) {
        super(objects);
    }

    @Override
    public AbstractIterator createIterator() {
        return new ProductIterator(this);
    }
}
