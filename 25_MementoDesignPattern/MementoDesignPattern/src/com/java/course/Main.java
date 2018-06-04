package com.java.course;

public class Main {

    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("Monster 1");

        Memento memento = originator.createMemento();

        CareTaker careTaker = new CareTaker();
        careTaker.addMemento(memento);

        originator.setState("Monster 2");
        originator.setState("Monster 3");

        memento = originator.createMemento();
        careTaker.addMemento(memento);

        originator.setState("monster 4");

        System.out.println("Originator current state : " + originator.getState());

        System.out.println("Resorting originator to previous state....");
        memento = careTaker.getMemento(1);
        //originator.setMemento(memento);
        originator.restoreMemento(memento);
        System.out.println("Originator  state : " + originator.getState());

        memento = careTaker.getMemento(0);
        //originator.setMemento(memento);
        originator.restoreMemento(memento);
        System.out.println("Originator  state : " + originator.getState());
    }
}
