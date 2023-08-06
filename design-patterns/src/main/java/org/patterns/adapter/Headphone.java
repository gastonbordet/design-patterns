package org.patterns.adapter;

public class Headphone implements Wired {
    @Override
    public boolean plugCable() {
        System.out.println("Headphone plugged!");
        return true;
    }
}
