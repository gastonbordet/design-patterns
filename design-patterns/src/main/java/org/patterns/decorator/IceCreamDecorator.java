package org.patterns.decorator;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class IceCreamDecorator implements IceCream {
    private IceCream iceCream;

    @Override
    public double cost() {
        return this.iceCream.cost();
    }
}
