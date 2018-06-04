package com.java.course;

import com.java.course.model.EndlessRunnerGame;
import com.java.course.model.FootBallGame;

/*
*The Template design pattern:
It defines the skeleton of an algorithm in a method, deferring some steps to
subclasses; it lets subclasses redefine certain steps of an algorithm without
changing the algorithm's structure.
We define the core functionalities in superclass(or abstract class) and them
all method/behaviours could be redefined in subclasses otherwise the code get
quickly redundant and tedious when it comes to maintainability, so the
template method pattern encapsulates algorithm so each subclass is able
to tweak certain properties or functionalities if needed.
* */
public class Main {
    public static void main(String[] args) {
        Game game = new FootBallGame();
        game.play();

    }
}
