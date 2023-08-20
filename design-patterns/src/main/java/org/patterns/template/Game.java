package org.patterns.template;

public abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    public final void play() {
        loadAssets();
        initialize();
        startPlay();
        if (addNewCharacter()) {
            addNewCharacterToGame();
        }
        endPlay();
    }

    protected abstract void addNewCharacterToGame();

    void loadAssets() {
        System.out.println("Loading assets ...");
    }

    boolean addNewCharacter() {
        return true;
    }
}
