package com.java.course.model;

import com.java.course.icommand.ICommand;

public class GameBoy {
    private ICommand upCommand,leftCommand,rightCommand,downCommand; //implementation

    public GameBoy(ICommand upCommand, ICommand leftCommand, ICommand rightCommand, ICommand downCommand) {
        this.upCommand = upCommand;
        this.leftCommand = leftCommand;
        this.rightCommand = rightCommand;
        this.downCommand = downCommand;
    }

    public void arrowUp(){
        upCommand.execute();
    }
    public void arrowDown(){
        downCommand.execute();
    }

    public void arrowLeft(){
        leftCommand.execute();
    }
    public void arrowRight(){
        rightCommand.execute();
    }
}
