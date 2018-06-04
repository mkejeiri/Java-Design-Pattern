package com.java.course;

public class Originator {
    //for simplicity we use string, in real world app we use java model class, e.g. employee, Characater.java..
    private String state;

    public void setState(String state) {
        this.state = state;
    }
    public String getState() {
        return state;
    }
    public Memento createMemento(){
        return new Memento(state);
    }

    public String restoreMemento(Memento memento){
        this.state= memento.getState();
        return state;
    }
    public void setMemento(Memento memento){
        this.state = memento.getState();
    }
}
