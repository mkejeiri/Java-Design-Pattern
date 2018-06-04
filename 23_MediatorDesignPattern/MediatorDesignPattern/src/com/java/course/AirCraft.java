package com.java.course;

public abstract class AirCraft {
    protected ATCMediator mediator;
    protected String name;

    public AirCraft(ATCMediator mediator,String name)  {
        this.name = name;
        this.mediator = mediator;
    }

    public abstract void send(String message);
    public abstract void receive(String message);
}
