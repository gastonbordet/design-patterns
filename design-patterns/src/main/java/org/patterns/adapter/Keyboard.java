package org.patterns.adapter;

public class Keyboard implements Wireless {
    @Override
    public boolean pairBluetooth() {
        System.out.println("Pairing keyboard via bluetooth ... 1");
        System.out.println("Pairing keyboard via bluetooth ... 2");
        System.out.println("keyboard connected!");
        return true;
    }
}
