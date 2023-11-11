package org.patterns.iterator;

import lombok.Getter;

@Getter
public class DevStoreCatalog {
    private static final int MAX_ITEMS = 4;
    private int catalogNumber = 0;
    private Product[] catalog;

    public DevStoreCatalog() {
        catalog = new Product[MAX_ITEMS];
        addItem("java t-shirt", 39.00);
        addItem("nodejs t-shirt", 39.00);
        addItem("python t-shirt", 39.00);
        addItem("go t-shirt", 39.00);
    }

    public void addItem(String description, double price) {
        var product = new Product(description, price);

        if (catalogNumber >= MAX_ITEMS) {
            System.out.println("Catalog is full.");
        } else {
            catalog[catalogNumber] = product;
            catalogNumber++;
        }
    }

    public DevStoreIterator createIterator() {
        return new DevStoreIterator(catalog);
    }
}
