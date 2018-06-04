package com.kejeiri.java.course.interfaces;

import com.kejeiri.java.course.model.NewsBulletin;

public interface IObserver {
    void attachTo(ITopic topic);
    void deattach();
    void newTopic(String message);
}
