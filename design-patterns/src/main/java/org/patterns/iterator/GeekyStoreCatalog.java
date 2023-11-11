package org.patterns.iterator;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class GeekyStoreCatalog {
    private List<Product> catalog;

    public GeekyStoreCatalog() {
        catalog = new ArrayList<>();
        addItem("Superman comic", 9.00);
        addItem("Batman t-shirt", 49.00);
    }

    public void addItem(String description, double price) {
        var product = new Product(description, price);
        catalog.add(product);
    }

    public GeekyStoreIterator createIterator() {
        return new GeekyStoreIterator(catalog);
    }
}
