package org.patterns.iterator;

import lombok.AllArgsConstructor;

import java.util.List;

public class GeekyStoreIterator implements Iterator {
    List<Product> catalog;
    private int position = 0;

    public GeekyStoreIterator(List<Product> catalog) {
        this.catalog = catalog;
    }
    @Override
    public boolean hasNext() {
        if (position >= catalog.size()) return false;
        return true;
    }

    @Override
    public Object get() {
        var p = catalog.get(position);
        position++;
        return p;
    }
}
