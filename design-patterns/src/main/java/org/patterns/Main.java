package org.patterns;

import org.patterns.strategy.payment.CreditCard;
import org.patterns.strategy.payment.Paypal;
import org.patterns.strategy.payment.Product;
import org.patterns.strategy.payment.ShoppingCart;
import org.patterns.strategy.payment.Paypal;
import org.patterns.strategy.payment.Product;
import org.patterns.strategy.payment.ShoppingCart;
import org.patterns.strategy.scoreboard.Balloon;
import org.patterns.strategy.scoreboard.Clown;
import org.patterns.strategy.scoreboard.Scoreboard;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void strategy() {
        var pen = new Product("abc123", 5);
        var pencil = new Product("qwe456", 3);

        var shoppingCart = new ShoppingCart();
        shoppingCart.addProduct(pen);
        shoppingCart.addProduct(pencil);

        shoppingCart.pay(new Paypal());
    }
    public static void main(String[] args) {
        // strategy();

    }
}