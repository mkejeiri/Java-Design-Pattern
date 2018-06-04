package com.kejeiri.java.course.model;

import com.kejeiri.java.course.imodel.IceCream;

public class MintIceCream extends IceCreamDecorator{
    public MintIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost() {
        System.out.println("Adding mint Ice-cream!");
        return 1.50+super.cost();
    }
}
