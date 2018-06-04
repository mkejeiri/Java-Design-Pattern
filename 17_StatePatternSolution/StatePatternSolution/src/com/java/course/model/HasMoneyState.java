package com.java.course.model;

public class HasMoneyState implements IState{
    private SodaVendingMachine sodaVendingMachine;

    public HasMoneyState(SodaVendingMachine sodaVendingMachine) {
        this.sodaVendingMachine = sodaVendingMachine;
    }

    @Override
    public void insertMoney() {
        System.out.println("No need to insert a dollar");
    }

    @Override
    public void ejectMoney() {
        System.out.println("Returning a dollar");
        sodaVendingMachine.setState(sodaVendingMachine.getNoMoneyState());
    }

    @Override
    public void select() {
        System.out.println("selected item...");
        sodaVendingMachine.setState(sodaVendingMachine.getSoldState());
        sodaVendingMachine.setCount(sodaVendingMachine.getCount()-1);
    }

    @Override
    public void dispense() {
        System.out.println("No soda dispensed...");
    }

    @Override
    public String toString() {
        return "Waiting for a new selection...";
    }
}
