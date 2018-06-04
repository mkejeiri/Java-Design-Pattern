package com.java.course.actions;

import com.java.course.icommand.ICommand;
import com.java.course.model.MarioCharacterReceiver;

public class MarioDownCommand implements ICommand {
    private MarioCharacterReceiver marioCharacter;

    public MarioDownCommand(MarioCharacterReceiver marioCharacter) {
        this.marioCharacter = marioCharacter;
    }

    @Override
    public void execute() {
        marioCharacter.moveDown();
    }
}
