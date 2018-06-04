package com.java.course.model;

import com.java.course.Game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FootBallGame extends Game {
    @Override
    public void initialize() {
        System.out.println("Football initializing ...");
    }

    @Override
    public void startPlay() {
        System.out.println("Football starting ...");
    }

    @Override
    public void endPlay() {
        System.out.println("Football ending ...");
    }

    @Override
    public boolean addNewGameCharacter() {
        String question = "Would you like to add a new character to the game? (y/n)";
         return (getUserInput(question).toLowerCase().startsWith("y"));
    }

    @Override
    public boolean endTheGame() {
        String question = "Would you like to end the game? (y/n)";
        return (getUserInput(question).toLowerCase().startsWith("y"));
    }

    private String getUserInput(String question) {
        String answer = null;
        System.out.println(question);
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException e) {
            System.out.println("IO error!");
        }
        if (answer==null){
            return "no";
        }
        return answer;
    }
    //..more methods
}
