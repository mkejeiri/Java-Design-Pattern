package com.java.course.actions;

import com.java.course.icommand.ICommand;
import com.java.course.model.MarioCharacterReceiver;

public class MarioUpCommand implements ICommand {
    private MarioCharacterReceiver marioCharacter;

    public MarioUpCommand(MarioCharacterReceiver marioCharacter) {
        this.marioCharacter = marioCharacter;
    }

    @Override
    public void execute() {
        marioCharacter.moveUp();
    }
}
