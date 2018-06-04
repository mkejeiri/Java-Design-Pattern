package com.java.course;

public class Main {

    public static void main(String[] args) {

        ATCMediator mediator = new ATCMediatorImpl();

        AirCraft airCraft1 = new AirCraftImpl(mediator,"airCraft1");
        AirCraft airCraft2 = new AirCraftImpl(mediator,"airCraft2");
        AirCraft airCraft3 = new AirCraftImpl(mediator,"airCraft3");
        AirCraft airCraft4 = new AirCraftImpl(mediator,"airCraft4");

        mediator.addAirCraft(airCraft1);
        mediator.addAirCraft(airCraft2);
        mediator.addAirCraft(airCraft3);
        mediator.addAirCraft(airCraft4);
        airCraft2.send("from aircraft1");
    }
}
