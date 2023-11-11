package org.patterns.iterator;

public class Seller {
    public void printCatalog(Iterator catalog) {
        while(catalog.hasNext()) {
            var p = (Product) catalog.get();
            System.out.println(String.format("%s - %f", p.getDescription(), p.getPrice()));
        }
    }
}
