package org.patterns.factory;

public class NYBurguerStore extends HamburgerStore {
    @Override
    public Hamburger createHamburger(String type) {
        if (type.equals("cheese")) {
            return new NYCheeseBurger("NY cheese burger");
        } else if (type.equals("veggie")) {
            return new NYVeggieBurger("NY veggie burger");
        }

        return null;
    }
}
