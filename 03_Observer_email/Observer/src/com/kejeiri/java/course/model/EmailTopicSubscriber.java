package com.kejeiri.java.course.model;

import com.kejeiri.java.course.interfaces.Observer;
import com.kejeiri.java.course.interfaces.Subject;
/*
* a listener or observer
* */
public class EmailTopicSubscriber implements Observer {
    private String name;
    //ref to the Subject class
    private Subject topic;

    public EmailTopicSubscriber(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Override
    public void update() {
        String msg =(String)topic.getUpdate(this);
        if (msg == null) System.out.println(name + " No new message on this topic" );
        else System.out.println(name + " Retrieving message: "+msg);
    }

    @Override
    public void setSubject(Subject subject) {
        this.topic = subject;
    }
}
