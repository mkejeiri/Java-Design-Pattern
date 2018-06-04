package com.kejeiri.java.course;

import com.kejeiri.java.course.business.DiscountVisitor;
import com.kejeiri.java.course.business.TaxVisitor;
import com.kejeiri.java.course.model.Jacket;
import com.kejeiri.java.course.model.Shirt;
import com.kejeiri.java.course.model.TShirt;

public class Main {

    public static void main(String[] args) {
        TaxVisitor taxVisitor = new TaxVisitor();
        Jacket jacket = new Jacket(40.99);
        Shirt shirt = new Shirt(5.25);
        TShirt tShirt = new TShirt(6.59);


        System.out.println(jacket.accept(taxVisitor));
        System.out.println(shirt.accept(taxVisitor));
        System.out.println(tShirt.accept(taxVisitor));

        System.out.println("============================================");
        System.out.println("Discount Tax not included:");
        DiscountVisitor discountVisitor = new DiscountVisitor();
        System.out.println(jacket.accept(discountVisitor));
        System.out.println(shirt.accept(discountVisitor));
        System.out.println(tShirt.accept(discountVisitor));







    }
}
