package com.java.course;

public class AirCraftImpl  extends AirCraft{
    public AirCraftImpl(ATCMediator mediator,String name) {
        super(mediator,name);
    }

    @Override
    public void send(String message) {
        System.out.println(this.name+" is sending message = " +message);
        this.mediator.sendMessage(message,this);
    }

    @Override
    public void receive(String message) {
        System.out.println(this.name+" is receiving message = " +message);
    }
}
