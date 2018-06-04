package com.kejeiri.java.course;

import com.kejeiri.java.course.interfaces.Observer;
import com.kejeiri.java.course.model.EmailTopic;
import com.kejeiri.java.course.model.EmailTopicSubscriber;

public class Main {

    public static void main(String[] args) {
        EmailTopic topic = new EmailTopic();

        //Create observer
        Observer firstObserver = new EmailTopicSubscriber("First observer");
        Observer secondObserver = new EmailTopicSubscriber("Second observer");
        Observer thirdObserver = new EmailTopicSubscriber("Third observer");
        topic.register(firstObserver);
        topic.register(secondObserver);
        topic.register(thirdObserver);

        //attaching observer to subject
        //we could include this inside the register to
        //avoid an update in two places
        firstObserver.setSubject(topic);
        secondObserver.setSubject(topic);
        thirdObserver.setSubject(topic);

        //check for update
        firstObserver.update();
        secondObserver.update();
        thirdObserver.update();

        //provider/subject (broadcaster)
        topic.unregister(firstObserver);
        topic.postMessage("hello Subscribers");



    }
}
 