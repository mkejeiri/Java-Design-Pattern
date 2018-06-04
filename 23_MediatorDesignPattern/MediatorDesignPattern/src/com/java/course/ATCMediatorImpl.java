package com.java.course;

import java.util.ArrayList;
/*
* through the mediator we loose coupling our classes (minimize the dependencies between classes),
* this should be the only reason for using mediator!
* */

public class ATCMediatorImpl  implements ATCMediator{
    //ATC needs to know about all aircraft
    ArrayList<AirCraft> airCraftList;
    public ATCMediatorImpl() {
        this.airCraftList = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, AirCraft msgSendingAirCraft ) {
        for (AirCraft airCraft : this.airCraftList) {
            //message should'nt be received by the aircraft sending the message
            if (!airCraft.equals(msgSendingAirCraft)){
                airCraft.receive(message);
            }
        }
    }

    @Override
    public void addAirCraft(AirCraft airCraft) {
        this.airCraftList.add(airCraft);
    }
}
