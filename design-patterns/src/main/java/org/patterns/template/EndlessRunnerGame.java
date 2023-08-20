package org.patterns.template;

public class EndlessRunnerGame extends Game {
    @Override
    void initialize() {
        System.out.println("Endless runner initializing ...");
    }

    @Override
    void startPlay() {
        System.out.println("Endless runner starting ...");
    }

    @Override
    void endPlay() {
        System.out.println("Endless runner ending ...");
    }

    @Override
    protected void addNewCharacterToGame() {
        System.out.println("Adding new character to Endless runner game ...");
    }
}
