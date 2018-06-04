package com.kejeiri.java.course.business;

import com.kejeiri.java.course.Interfaces.Visitor;
import com.kejeiri.java.course.model.Jacket;
import com.kejeiri.java.course.model.Shirt;
import com.kejeiri.java.course.model.TShirt;

import java.text.DecimalFormat;

public class TaxVisitor implements Visitor {
    DecimalFormat decimalFormat = new DecimalFormat("#.##");
    @Override
    public double visit(Shirt shirt) {
        System.out.println("Shirt final price with tax: ");
        return Double.parseDouble(decimalFormat.format(shirt.getPrice() *.15+shirt.getPrice()));
    }

    @Override
    public double visit(TShirt tShirt) {
        System.out.println("TShirt final price with tax: ");
        return Double.parseDouble(decimalFormat.format(tShirt.getPrice() *.20+tShirt.getPrice()));
    }

    @Override
    public double visit(Jacket jacket) {
        System.out.println("Jacket final price with tax: ");
        return Double.parseDouble(decimalFormat.format(jacket.getPrice() *.10+jacket.getPrice()));
    }
}
