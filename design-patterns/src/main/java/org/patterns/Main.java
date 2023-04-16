package org.patterns;

import org.patterns.observer.EmailTopic;
import org.patterns.observer.EmailTopicSubscriber;
import org.patterns.observer.Observer;
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

import java.util.List;

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

    public static void observer() {
        EmailTopic topic = new EmailTopic();
        List<Observer> observers = List.of(
                new EmailTopicSubscriber("First observer"),
                new EmailTopicSubscriber("Second observer"),
                new EmailTopicSubscriber("Third observer")
        );

        // Register observer to topic and attach topic to observer
        observers.stream().forEach(observer -> {
            topic.register(observer);
            observer.setSubject(topic);
        });

        // Check for updates
        observers.stream().forEach(observer -> observer.update());

        // Update topic
        topic.postMessage("Hello! This is a new message to all subscribers!");
    }

    public static void main(String[] args) {
        // strategy();
        observer();
    }
}