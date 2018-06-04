package com.java.course.actions;

import com.java.course.icommand.ICommand;
import com.java.course.model.KirbyCharacterReceiver;

public class KirbyUpCommand implements ICommand {
    private KirbyCharacterReceiver kirbyCharacter;

    public KirbyUpCommand(KirbyCharacterReceiver kirbyCharacter) {
        this.kirbyCharacter = kirbyCharacter;
    }

    @Override
    public void execute() {
        kirbyCharacter.moveUp();
    }
}
