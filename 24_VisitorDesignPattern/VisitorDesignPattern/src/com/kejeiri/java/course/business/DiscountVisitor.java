package com.kejeiri.java.course.business;

import com.kejeiri.java.course.Interfaces.Visitor;
import com.kejeiri.java.course.model.Jacket;
import com.kejeiri.java.course.model.Shirt;
import com.kejeiri.java.course.model.TShirt;

import java.text.DecimalFormat;

public class DiscountVisitor implements Visitor {
    DecimalFormat decimalFormat = new DecimalFormat("#.##");
    @Override
    public double visit(Shirt shirt) {
        double discount = 0.1;
        System.out.println("Shirt discount: "+ discount*100);
        return Double.parseDouble(decimalFormat.format(shirt.getPrice()*(1.0-discount)));
    }

    @Override
    public double visit(TShirt tShirt) {
        double discount = 0.5;
        System.out.println("TShirt discount: " + discount*100);
        return Double.parseDouble(decimalFormat.format(tShirt.getPrice()*(1.0-discount)));
    }

    @Override
    public double visit(Jacket jacket) {
        double discount = 0.3;
        System.out.println("Jacket discount: "+ discount*100);
        return Double.parseDouble(decimalFormat.format(jacket.getPrice()*(1.0-discount)));
    }
}
