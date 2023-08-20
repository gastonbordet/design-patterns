package org.patterns;

import org.patterns.adapter.*;
import org.patterns.command.Gameboy;
import org.patterns.command.MarioCharacterReceiver;
import org.patterns.command.MarioDownCommand;
import org.patterns.command.MarioUpCommand;
import org.patterns.decorator.BasicIceCream;
import org.patterns.decorator.ChocolateIceCream;
import org.patterns.decorator.VanillaIceCream;
import org.patterns.facade.CPU;
import org.patterns.facade.ComputerFacade;
import org.patterns.facade.HardDrive;
import org.patterns.facade.Memory;
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
import org.patterns.template.EndlessRunnerGame;
import org.patterns.template.FootballGame;

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

    public static void command() {
        var marioReceiver = new MarioCharacterReceiver("mario");
        var marioUpCommand = new MarioUpCommand(marioReceiver);
        var marioDownCommand = new MarioDownCommand(marioReceiver);
        var gameboy = new Gameboy(marioUpCommand, marioDownCommand, null, null);

        gameboy.arrowUp();
        gameboy.arrowDown();
    }

    public static void adapter() {
        var mouse = new Mouse();
        var keyboard = new Keyboard();
        var headphone = new Headphone();
        var computer = new Computer();

        computer.connectViaBluetooth(mouse);
        computer.connectViaBluetooth(keyboard);
        computer.connectViaBluetooth(new HeadphoneWiredAdapter(headphone));

        System.out.println(String.format("%d devices connected!", computer.getDevices().size()));
    }

    public static void facade() {
        var computer = new ComputerFacade(
          new CPU(),
          new Memory(),
          new HardDrive()
        );

        computer.start();
    }

    public static void template() {
        var footballGame = new FootballGame();
        var endlessRunnerGame = new EndlessRunnerGame();

        endlessRunnerGame.play();
        footballGame.play();
    }

    public static void main(String[] args) {
        // strategy();
        // observer();
        // decorator();
        // factory();
        // singleton();
        // command();
        // adapter();
        // facade();
        template();
    }
}