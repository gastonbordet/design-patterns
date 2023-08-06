package org.patterns.adapter;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class HeadphoneWiredAdapter implements Wireless {
    public Headphone headphone;

    @Override
    public boolean pairBluetooth() {
        if (!headphone.plugCable()) return false;
        System.out.println("Pairing headphone via bluetooth ... 1");
        System.out.println("Pairing headphone via bluetooth ... 2");
        System.out.println("Pairing headphone via bluetooth ... 3");
        System.out.println("Pairing headphone via bluetooth ... 4");
        System.out.println("keyboard connected!");
        return true;
    }
}
