package com.kejeiri.java.course.controller;

public class PaypalAgorithm implements  Payment{
    private String email;

    public PaypalAgorithm(String email, String password) {
        this.email = email;
        this.password = password;
    }

    private String password;
    @Override
    public void pay(int amount) {
        System.out.println(amount+" paid with paypal!");
    }
}
