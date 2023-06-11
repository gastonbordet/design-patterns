package org.patterns.factory;

public class ChicagoBurgerStore extends HamburgerStore {
    @Override
    public Hamburger createHamburger(String type) {
        if (type.equals("cheese")) {
            return new ChicagoCheeseBurger("Chicago cheese burger");
        } else if (type.equals("veggie")) {
            return new ChicagoVeggieBurger("Chicago veggie burger");
        }

        return null;
    }
}
