package com.kejeiri.java.course.interfaces;

public interface ITopic {
    public void register(IObserver observer);
    public void unregister(IObserver observer);
    public void dispatchTo(IObserver observer);
    public void notifyAllObservers();
}
