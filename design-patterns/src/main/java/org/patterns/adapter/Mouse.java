package org.patterns.adapter;

public class Mouse implements Wireless{
    @Override
    public boolean pairBluetooth() {
        System.out.println("Pairing mouse via bluetooth ... 1");
        System.out.println("Pairing mouse via bluetooth ... 2");
        System.out.println("Mouse connected!");
        return true;
    }
}
