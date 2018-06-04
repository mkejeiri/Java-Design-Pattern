package com.kejeiri.Model;

import com.kejeiri.controller.ScoreBoardBase;

public class Balloon extends ScoreBoardBase {
    @Override
    public int calculateScore(int taps, int multiplier) {
        return (taps*multiplier)-20;
    }
}
