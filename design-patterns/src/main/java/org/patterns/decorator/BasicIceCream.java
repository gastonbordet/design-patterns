package org.patterns.decorator;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BasicIceCream implements IceCream {
    @Override
    public double cost() {
        return 0.50;
    }
}
