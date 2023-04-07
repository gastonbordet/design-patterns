package org.patterns.strategy.scoreboard;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Clown implements ScoreAlgorithmBase {
    @Override
    public int calculateScore(int taps, int multiplier) {
        return taps * multiplier - 10;
    }
}
