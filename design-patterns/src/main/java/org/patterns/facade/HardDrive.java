package org.patterns.facade;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class HardDrive {
    public byte[] read(long Iba, int size) {
        return new byte[]{'f', 'z'};
    }
}
