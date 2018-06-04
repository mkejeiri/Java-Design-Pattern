package com.kejeiri.java.course.controller;

import com.kejeiri.java.course.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Product> productsList;

    public ShoppingCart() {
        this.productsList = new ArrayList<>();
    }
    public void addProduct(Product product){
        productsList.add(product);
    }
    public void removeProduct(Product product){
        productsList.remove(product);
    }
    public int calculateTotal(){
        int sum=0;
        for (Product product: productsList) {
            sum+=product.getPrice();
        }
        return sum;
    }
    public void pay(Payment payment){
        int amount= calculateTotal();
        payment.pay(amount);
    }
}
