package com.kejeiri.java.course.model;

import com.kejeiri.java.course.interfaces.IObserver;
import com.kejeiri.java.course.interfaces.ITopic;

import java.util.ArrayList;
import java.util.List;

public class NewsBulletin implements ITopic {
    List<IObserver> listeners;
    private String message;

    public NewsBulletin() {
        this.listeners= new ArrayList<>();
    }

    @Override
    public void register(IObserver observer) {
        if (observer == null) throw new NullPointerException("Observer is null!");
        else if (!listeners.contains(observer)) {
            observer.attachTo(this);
            listeners.add(observer);
        }
    }
    @Override
    public void unregister(IObserver observer) {
        observer.deattach();
        listeners.remove(observer);
    }
    @Override
    public void dispatchTo(IObserver observer) {
        observer.newTopic(message);
    }

    @Override
    public void notifyAllObservers() {
        for (IObserver observer : this.listeners) {
            dispatchTo(observer);
        }
    }

    public void postNews(String message){
        this.message = message;
        notifyAllObservers();
    }
}
