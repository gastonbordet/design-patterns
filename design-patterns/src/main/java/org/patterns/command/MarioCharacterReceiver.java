package org.patterns.command;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class MarioCharacterReceiver implements CharacterReceiver {
    private String name;

    @Override
    public void moveUp() {
        System.out.printf(getName() + " moving up!");
    }

    public void moveLeft() {
        System.out.printf(getName() + " moving left!");
    }

    @Override
    public void moveRight() {
        System.out.printf(getName() + " moving right!");
    }

    @Override
    public void moveDown() {
        System.out.printf(getName() + " moving down!");
    }
}
