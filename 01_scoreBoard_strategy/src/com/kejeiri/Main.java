package com.kejeiri;

import com.kejeiri.Model.Balloon;
import com.kejeiri.Model.Clown;
import com.kejeiri.Model.SquareBalloon;
import com.kejeiri.controller.ScoreBoard;

public class Main {

    public static void main(String[] args) {
        /*
            We chose composition over inheritance because :
            scoreBoard could evolve and required additiional implementations that aren't shared between
            Balloon, SquareBalloon & Clown classes
        */
        ScoreBoard scoreBoard = new ScoreBoard();
        System.out.print("Balloon taps score: ");
        scoreBoard.scoreBoardBase = new Balloon();
        scoreBoard.show(10,78);


        System.out.print("Clown taps score: ");
        scoreBoard.scoreBoardBase = new Clown();
        scoreBoard.show(10,78);


        System.out.print("SquareBalloon taps score: ");
        scoreBoard.scoreBoardBase = new SquareBalloon();
        scoreBoard.show(10,78);


    }
}
