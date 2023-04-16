package org.patterns;

import org.patterns.strategy.scoreboard.Balloon;
import org.patterns.strategy.scoreboard.Clown;
import org.patterns.strategy.scoreboard.Scoreboard;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void strategy() {
        Scoreboard scoreboard = new Scoreboard(new Balloon());
        scoreboard.showScore(10, 5);
        scoreboard.setAlgorithmBase(new Clown());
        scoreboard.showScore(10, 5);
    }
    public static void main(String[] args) {
        // strategy();

    }
}