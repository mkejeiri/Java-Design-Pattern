package com.kejeiri.java.course.model;

import com.kejeiri.java.course.Interfaces.Visitable;
import com.kejeiri.java.course.Interfaces.Visitor;

public class Jacket implements Visitable {
    private double price;

    public double getPrice() {
        return price;
    }

    public Jacket(double price) {
        this.price = price;
    }


    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
