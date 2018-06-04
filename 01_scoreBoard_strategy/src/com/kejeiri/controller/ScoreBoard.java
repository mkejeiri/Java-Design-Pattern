package com.kejeiri.controller;
/*
    We chose composition over inheritance because :
    scoreBoard could evolve and required additiional implementations that aren't shared between
    Balloon, SquareBalloon & Clown classes
*/
public class ScoreBoard {
    //instance variable (composition instance of direct inheritance from this class
    public ScoreBoardBase scoreBoardBase;
    public void show(int taps, int mulitplier){
        System.out.println(scoreBoardBase.calculateScore(taps, mulitplier));
    }
}
