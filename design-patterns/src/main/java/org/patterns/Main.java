package org.patterns;

import org.patterns.decorator.BasicIceCream;
import org.patterns.decorator.ChocolateIceCream;
import org.patterns.decorator.VanillaIceCream;
import org.patterns.factory.ChicagoBurgerStore;
import org.patterns.factory.NYBurguerStore;
import org.patterns.observer.EmailTopic;
import org.patterns.observer.EmailTopicSubscriber;
import org.patterns.observer.Observer;
import org.patterns.singleton.EagerSingleton;
import org.patterns.singleton.LazySingleton;
import org.patterns.strategy.payment.Paypal;
import org.patterns.strategy.payment.Product;
import org.patterns.strategy.payment.ShoppingCart;

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

    public static void decorator() {
        var basicIceCream = new BasicIceCream();
        System.out.printf("\n %s", basicIceCream.cost());

        // Add vanilla to the order
        var vanilla = new VanillaIceCream(basicIceCream);
        System.out.printf("\n %s", vanilla.cost());

        // Add chocolate to the order
        var chocolate = new ChocolateIceCream(vanilla);
        System.out.printf("\n %s", chocolate.cost());
    }

    public static void factory() {
        var chicagoBurgerStore = new ChicagoBurgerStore();
        var nyBurgerStore = new NYBurguerStore();

        var burger1 = chicagoBurgerStore.orderHamburger("cheese");
        var burger2 = nyBurgerStore.orderHamburger("cheese");
    }

    public static void singleton() {
        var eager = EagerSingleton.getInstance();
        var lazySingleton = LazySingleton.getInstance();

        System.out.println("eager singleton obj 1: " + eager);
        System.out.println("eager singleton obj 2: " + EagerSingleton.getInstance());
        System.out.println("lazy singleton obj 1: " + lazySingleton);
        System.out.println("lazy singleton obj 2: " + LazySingleton.getInstance());
    }

    public static void main(String[] args) {
        // strategy();
        // observer();
        // decorator();
        // factory();
        singleton();
    }
}