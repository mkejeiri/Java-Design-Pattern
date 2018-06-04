package com.java.course.actions;

import com.java.course.icommand.ICommand;
import com.java.course.model.MarioCharacterReceiver;

public class MarioLeftCommand implements ICommand {
    private MarioCharacterReceiver marioCharacter;

    public MarioLeftCommand(MarioCharacterReceiver marioCharacter) {
        this.marioCharacter = marioCharacter;
    }

    @Override
    public void execute() {
        marioCharacter.moveLeft();
    }
}
