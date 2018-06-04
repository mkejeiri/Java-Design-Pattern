package com.java.course.actions;

import com.java.course.icommand.ICommand;
import com.java.course.model.MarioCharacterReceiver;

public class MarioRightCommand implements ICommand {
    private MarioCharacterReceiver marioCharacter;

    public MarioRightCommand(MarioCharacterReceiver marioCharacter) {
        this.marioCharacter = marioCharacter;
    }

    @Override
    public void execute() {
        marioCharacter.moveRight();
    }
}
