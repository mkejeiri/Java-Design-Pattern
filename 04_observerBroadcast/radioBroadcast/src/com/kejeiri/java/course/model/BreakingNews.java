package com.kejeiri.java.course.model;

import com.kejeiri.java.course.interfaces.IObserver;
import com.kejeiri.java.course.interfaces.ITopic;

import java.util.ArrayList;
import java.util.List;

public class BreakingNews implements ITopic {
    private String message;
    List<IObserver> subscribers;

    public BreakingNews() {
        this.subscribers = new ArrayList<>();
    }

    @Override
    public void register(IObserver observer) {
        if (observer == null) throw  new NullPointerException("Subscriber is null");
        if(!subscribers.contains(observer)) {
            observer.attachTo(this);
            subscribers.add(observer);
        }
    }

    @Override
    public void unregister(IObserver observer) {
        observer.deattach();
        subscribers.remove(observer);
    }

    @Override
    public void dispatchTo(IObserver observer) {
        observer.newTopic(message);
    }

    @Override
    public void notifyAllObservers() {
        for (IObserver observer : this.subscribers) {
            dispatchTo(observer);
        }
    }

    public void broadcastBreakingNews(String message){
        this.message = message;
        notifyAllObservers();
    }


}
