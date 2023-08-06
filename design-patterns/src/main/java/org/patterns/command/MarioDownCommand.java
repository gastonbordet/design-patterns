package org.patterns.command;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MarioDownCommand implements Command {
    private final MarioCharacterReceiver marioCharacterReceiver;


    @Override
    public void execute() {
        marioCharacterReceiver.moveDown();
    }
}
