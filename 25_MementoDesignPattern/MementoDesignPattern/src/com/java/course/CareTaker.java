package com.java.course;

import java.util.ArrayList;

public class CareTaker {
    private ArrayList<Memento> stateList;

    public CareTaker() {
        this.stateList = new ArrayList<>();
    }

    public void addMemento(Memento memento){
        this.stateList.add(memento);
    }
    public Memento getMemento(int index){
        return stateList.get(index);
    }
}
