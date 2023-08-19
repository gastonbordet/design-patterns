package org.patterns.facade;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Memory {
    public void load(long position, byte[] data) {
        System.out.println("Added item to memory " + position);
    }
}
