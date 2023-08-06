package org.patterns.command;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class MarioUpCommand implements Command {
    private MarioCharacterReceiver marioCharacterReceiver;
    @Override
    public void execute() {
        marioCharacterReceiver.moveUp();
    }
}
