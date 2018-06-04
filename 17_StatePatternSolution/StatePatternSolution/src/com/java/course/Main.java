package com.java.course;

import com.java.course.model.SodaVendingMachine;

public class Main {

    public static void main(String[] args) {
        SodaVendingMachine sodaVendingMachine = new SodaVendingMachine(10);
        System.out.println(sodaVendingMachine);
        System.out.println("=======================");

        sodaVendingMachine.insertMoney();
        sodaVendingMachine.select();
        System.out.println(sodaVendingMachine);
        System.out.println("=======================");

        sodaVendingMachine.insertMoney();
        sodaVendingMachine.select();
        System.out.println("=======================");

        sodaVendingMachine.insertMoney();
        sodaVendingMachine.select();
        System.out.println(sodaVendingMachine);
        System.out.println("=======================");



    }
}
