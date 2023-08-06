package org.patterns.command;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Gameboy implements Invoker {
    private Command upCommand, downCommand, leftCommand, rightCommand;

    @Override
    public void arrowUp() {
        upCommand.execute();
    }

    @Override
    public void arrowLeft() {
        leftCommand.execute();
    }

    @Override
    public void arrowRight() {
        rightCommand.execute();
    }

    @Override
    public void arrowDown() {
        downCommand.execute();
    }
}
