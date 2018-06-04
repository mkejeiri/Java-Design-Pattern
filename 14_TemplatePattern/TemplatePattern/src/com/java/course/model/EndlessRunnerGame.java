package com.java.course.model;

import com.java.course.Game;

public class EndlessRunnerGame extends Game {

    @Override
    public void initialize() {
        System.out.println("Endless runner initializing ...");
    }

    @Override
    public void startPlay() {
        System.out.println("Endless runner starting...");
    }

    @Override
    public void endPlay() {
        System.out.println("Endless runner ending...");
    }

    @Override
    public boolean addNewGameCharacter() {
        return false;
    }

    @Override
    public boolean endTheGame() {
        return super.endTheGame();
    }

    //..more methods
}
