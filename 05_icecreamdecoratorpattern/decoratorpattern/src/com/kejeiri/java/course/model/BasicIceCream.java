package com.kejeiri.java.course.model;

import com.kejeiri.java.course.imodel.IceCream;

public class BasicIceCream implements IceCream {
    public BasicIceCream() {
        System.out.println("basic Icecream is created");
    }

    @Override
    public double cost() {
        return 0.5;
    }
}
