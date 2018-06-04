package com.java.course.model;

public class SoldOutState implements IState{
    private SodaVendingMachine sodaVendingMachine;

    public SoldOutState(SodaVendingMachine sodaVendingMachine) {
        this.sodaVendingMachine = sodaVendingMachine;
    }

    @Override
    public void insertMoney() {
        System.out.println("machine sold out");
    }

    @Override
    public void ejectMoney() {
        System.out.println("insert money before ejecting");

    }

    @Override
    public void select() {
        System.out.println("No soda available");
    }

    @Override
    public void dispense() {
        System.out.println("Sold out!");
    }

    @Override
    public String toString() {
        return "Sold out!";
    }
}
