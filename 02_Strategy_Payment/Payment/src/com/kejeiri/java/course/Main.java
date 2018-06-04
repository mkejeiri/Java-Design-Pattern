package com.kejeiri.java.course;

import com.kejeiri.java.course.controller.CreditCardAlgorithm;
import com.kejeiri.java.course.controller.PaypalAgorithm;
import com.kejeiri.java.course.controller.ShoppingCart;
import com.kejeiri.java.course.model.Product;

public class Main {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Product pants= new Product("234",25);
        Product shirt = new Product("987",15);
        cart.addProduct(pants);
        cart.addProduct(shirt);
        //payment decision
        cart.pay(new CreditCardAlgorithm("Nocard","1245454"));
        cart.pay(new PaypalAgorithm("mypaypal@paypal.com","paypalsucks"));

     }
}
