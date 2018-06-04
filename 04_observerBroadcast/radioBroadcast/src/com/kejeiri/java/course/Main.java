package com.kejeiri.java.course;

import com.kejeiri.java.course.interfaces.IObserver;
import com.kejeiri.java.course.interfaces.ITopic;
import com.kejeiri.java.course.model.BreakingNews;
import com.kejeiri.java.course.model.CustomerSubscriber;
import com.kejeiri.java.course.model.NewsBulletin;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

public class Main {

    public static void main(String[] args) {
        NewsBulletin();
        System.out.println("\n\t-----------------------------------------------------\n\n");
        breakingNews();

    }

    private static void breakingNews() {
        BreakingNews breakingNews = new BreakingNews();
        IObserver observer1 = new CustomerSubscriber("Customer observer 1");
        IObserver observer2 = new CustomerSubscriber("Customer observer 2");
        IObserver observer3 = new CustomerSubscriber("Customer observer 3");
        IObserver observer4 = new CustomerSubscriber("Customer observer 4");

        breakingNews.register(observer1);
        breakingNews.register(observer2);
        breakingNews.register(observer3);
        breakingNews.register(observer4);

        breakingNews.broadcastBreakingNews("Breaking news 1");
        breakingNews.unregister(observer2);
        System.out.println("----------one Customer observer's been cancelled----------");
        breakingNews.broadcastBreakingNews("Breaking news 2");
    }

    private static void NewsBulletin() {
        IObserver iObserver1 = new CustomerSubscriber("Subscription Customer 1");
        IObserver iObserver2 = new CustomerSubscriber("Subscription Customer 2");
        IObserver iObserver3 = new CustomerSubscriber("Subscription Customer 3");
        IObserver iObserver4 = new CustomerSubscriber("Subscription Customer 4");

        NewsBulletin news = new NewsBulletin();
        news.register(iObserver1);
        news.register(iObserver2);
        news.register(iObserver3);
        news.register(iObserver4);

        news.postNews("All subscriptions included");
        news.unregister(iObserver3);
        System.out.println("----------one Customer subscription's been cancelled----------");
        news.postNews("one Customer subscription's been cancelled");
    }
}
