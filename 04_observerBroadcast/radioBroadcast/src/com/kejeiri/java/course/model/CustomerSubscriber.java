package com.kejeiri.java.course.model;

import com.kejeiri.java.course.interfaces.IObserver;
import com.kejeiri.java.course.interfaces.ITopic;

public class CustomerSubscriber implements IObserver {
    private String name;
    private ITopic topic;

    public CustomerSubscriber(String name) {
        this.name = name;
    }
    @Override
    public void attachTo(ITopic topic) {
        this.topic = topic;
    }


    @Override
    public void deattach() {
        this.topic=null;
    }

    @Override
    public void newTopic(String message) {
        System.out.println("the topic: "+message+ " for " + name + " has been broadcast!");
    }
}
