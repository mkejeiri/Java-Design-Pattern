package com.kejeiri.java.course.model;

import com.kejeiri.java.course.imodel.IceCream;

public class PeanutIceCream extends IceCreamDecorator {
    public PeanutIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost() {
        System.out.println("adding peanut ice-cream!");
        return 1.75+super.cost();
    }
}
