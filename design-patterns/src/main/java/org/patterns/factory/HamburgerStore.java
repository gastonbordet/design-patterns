package org.patterns.factory;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class HamburgerStore {
    public Hamburger orderHamburger(String type) {
        Hamburger burger = this.createHamburger(type);
        burger.prepare();
        burger.cook();
        burger.box();

        return burger;
    }

    public abstract Hamburger createHamburger(String type);
}
