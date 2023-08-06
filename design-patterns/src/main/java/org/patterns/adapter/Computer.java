package org.patterns.adapter;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Computer {
    private List<Wireless> devices = new ArrayList<>();
    public void connectViaBluetooth(Wireless wirelessDevice) {
        if (wirelessDevice.pairBluetooth()) {
            devices.add(wirelessDevice);
        }
    }
}
