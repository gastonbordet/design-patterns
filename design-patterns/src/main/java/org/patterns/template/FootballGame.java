package org.patterns.template;

public class FootballGame extends Game {
    @Override
    void initialize() {
        System.out.println("Football game initializing ...");
    }

    @Override
    void startPlay() {
        System.out.println("Football game starting ...");
    }

    @Override
    void endPlay() {
        this.finishMatch();
        System.out.println("Football game ending ...");
    }

    @Override
    protected void addNewCharacterToGame() {
        System.out.println("Adding new character to Football game ...");
    }

    public void finishMatch() {
        System.out.println("Football match ending");
    }
}
