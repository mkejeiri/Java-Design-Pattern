package com.java.course;

public abstract class Game {
    public abstract void initialize();
    public abstract void startPlay();
    public abstract void endPlay();

    public final void play(){
        do {
            initialize();
            startPlay();
            if (addNewGameCharacter()){
                addNewGameCharacterToTheGame();
            }
            endPlay();
        }while(!endTheGame());
    }
    //Template method
    //we give the options to implement or not to the subclasses
    //Hooked-on template method: declare in an abstract class and given abstract or a default implementation

    //declare as an abstract
    public abstract boolean addNewGameCharacter();

    //declare as a default
    public boolean endTheGame(){
        return  true;
    }

    private void addNewGameCharacterToTheGame(){
        System.out.println("adding a new character to the game!");
    }
    //regardless on type of Game we need to load assets into computer memory.
    void loadAssets(){
        System.out.println("Loading Game Assets");
    }

}
