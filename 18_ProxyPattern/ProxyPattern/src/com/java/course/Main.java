package com.java.course;

public class Main {

    public static void main(String[] args) {
        IBank bank = new ProxyBank();
        try {
            bank.withdrawMoney("kejeiri");
            bank.withdrawMoney("me@me");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
