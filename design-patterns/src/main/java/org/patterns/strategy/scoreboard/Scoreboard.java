package org.patterns.strategy.scoreboard;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Scoreboard {
    private ScoreAlgorithmBase algorithmBase;

    public void showScore(int taps, int multiplier) {
        System.out.println(algorithmBase.calculateScore(taps, multiplier));
    }
}
