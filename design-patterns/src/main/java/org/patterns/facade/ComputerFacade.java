package org.patterns.facade;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ComputerFacade {
    private CPU processor;
    private Memory ram;
    private HardDrive hd;

    public void start() {
        processor.freeze();
        ram.load(1, hd.read(123, 200));
        processor.jump(1);
        processor.execute();
    }
}
