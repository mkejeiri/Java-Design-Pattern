package com.kejeiri.java.course.model;

import com.kejeiri.java.course.imodel.IceCream;

public class VanillaIceCream  extends IceCreamDecorator{
    public VanillaIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost() {
        System.out.println("Adding vanilla Ice-cream!");
        return 1.0+super.cost();
    }
}
