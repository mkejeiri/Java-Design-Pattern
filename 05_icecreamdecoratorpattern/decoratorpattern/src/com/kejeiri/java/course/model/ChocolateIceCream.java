package com.kejeiri.java.course.model;

import com.kejeiri.java.course.imodel.IceCream;

public class ChocolateIceCream extends IceCreamDecorator{
    public ChocolateIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost() {
        System.out.println("Adding chocolate ice-cream!");
        return 1.0+super.cost();
    }
}
