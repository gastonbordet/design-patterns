package org.patterns.iterator;

public class DevStoreIterator implements Iterator {
    private Product[] catalog;
    private int position = 0;

    public DevStoreIterator(Product[] catalog) {
        this.catalog = catalog;
    }
    @Override
    public boolean hasNext() {
        if (position >= catalog.length) return false;
        return true;
    }

    @Override
    public Object get() {
        var p = catalog[position];
        position++;
        return p;
    }
}
