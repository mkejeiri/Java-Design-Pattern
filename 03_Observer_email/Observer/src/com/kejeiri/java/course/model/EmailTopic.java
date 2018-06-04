package com.kejeiri.java.course.model;
import com.kejeiri.java.course.interfaces.Observer;
import com.kejeiri.java.course.interfaces.Subject;

import java.util.ArrayList;
import java.util.List;
/*
 * Satellite : broadcaster
 * */
public class EmailTopic implements Subject{
    private List<Observer> observers;
    private String message;

    public EmailTopic() {
        this.observers = new ArrayList<>();
    }
    public List<Observer> getObservers() {
        return observers;
    }
    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    @Override
    public void register(Observer observer) {
        if (observer == null) throw new NullPointerException("Null object/Observer");
        if(!observers.contains(observer)) observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: observers) {
            observer.update();
        }
    }

    @Override
    public Object getUpdate(Observer observer) {
        return this.message;
    }

    public void postMessage(String msg){
        System.out.println("Message posted to my Topic " + msg);
        this.message = msg;
        notifyObservers();
    }
}
