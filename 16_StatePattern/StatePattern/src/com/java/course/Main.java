package com.java.course;
import com.java.course.model.SodaMachine;

public class Main {
    public static void main(String[] args) {
        SodaMachine sodaMachine = new SodaMachine(10);
        sodaMachine.insertMoney();
        sodaMachine.select();
        sodaMachine.dispense();
        System.out.println("Inventory: " + sodaMachine.getCount());
        System.out.println("=========================");
        sodaMachine.insertMoney();
        sodaMachine.ejectMoney();
        sodaMachine.select();
        System.out.println("Inventory: " + sodaMachine.getCount());
        System.out.println("=========================");
        sodaMachine.insertMoney();
        sodaMachine.select();
        sodaMachine.dispense();
        sodaMachine.ejectMoney();
        System.out.println("Inventory: " + sodaMachine.getCount());
        System.out.println("=========================");
        sodaMachine.ejectMoney();
        sodaMachine.insertMoney();
        sodaMachine.select();
        sodaMachine.ejectMoney();
        sodaMachine.dispense();
        System.out.println("Inventory: " + sodaMachine.getCount());



    }
}
