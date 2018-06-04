package com.java.course;

import com.java.course.actions.*;
import com.java.course.icommand.ICommand;
import com.java.course.model.GameBoy;
import com.java.course.model.KirbyCharacterReceiver;
import com.java.course.model.MarioCharacterReceiver;


/*
                        COMMAND DESIGN PATTERN
    it's kind of one size fits all situations; same command will execute the appropriate actions depending on the request.
    It encapsulates a request as an object (Character = the game card), thereby enables us
    to parametrize other OBJECTS wjth different requests, queues or logs...

                                EXAMPLE
                                -------
*  The game is no longer character dependent!, we could inject any card (character Kirby/mario) into the console (Gameboy)
*  ;i.e inject (DI) of any type of character command (MarioUpCommand,KirbyUpCommand, ....) into the console which
*  means insert any card!.
* */

public class Main {

    public static void main(String[] args) {
        //Create Mario character
        MarioCharacterReceiver mario = new MarioCharacterReceiver("MarioXXL");

        //Create commands
        ICommand upCommand = new MarioUpCommand(mario);
        ICommand leftCommand = new MarioLeftCommand(mario);
        ICommand rightCommand = new MarioRightCommand(mario);
        ICommand downCommand = new MarioDownCommand(mario);

        //Create the Invoker (console) for Mario
        GameBoy console;
        console = new GameBoy(upCommand, leftCommand, rightCommand,downCommand);
        console.arrowUp();
        console.arrowDown();
        console.arrowLeft();
        console.arrowRight();

        //Create Kirby Character
        KirbyCharacterReceiver kirby = new KirbyCharacterReceiver("Kirby---");

        //Create commands
        ICommand KirbyUpCommand = new KirbyUpCommand(kirby);
        ICommand KirbyLeftCommand = new KirbyLeftCommand(kirby);
        ICommand KirbyRightCommand = new KirbyRightCommand(kirby);
        ICommand KirbyDownCommand = new KirbyDownCommand(kirby);

        //create the Invoker for Kirby
        console = new GameBoy(KirbyUpCommand,KirbyLeftCommand,KirbyRightCommand,KirbyDownCommand);
        console.arrowUp();
        console.arrowRight();
        console.arrowLeft();
        console.arrowDown();



    }
}
