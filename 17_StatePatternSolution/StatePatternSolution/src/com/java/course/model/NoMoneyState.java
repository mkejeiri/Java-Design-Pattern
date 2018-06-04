package com.java.course.model;

public class NoMoneyState implements IState{
    private SodaVendingMachine sodaVendingMachine;

    public NoMoneyState(SodaVendingMachine sodaVendingMachine) {
        this.sodaVendingMachine = sodaVendingMachine;
    }

    @Override
    public void insertMoney() {
        System.out.println("You inserted a dollar");
        sodaVendingMachine.setState(sodaVendingMachine.getHasMoneyState());
    }

    @Override
    public void ejectMoney() {
        System.out.println("you haven't inserted a dollar");
    }

    @Override
    public void select() {
        System.out.println("Your selected but there is no money");
    }

    @Override
    public void dispense() {
        System.out.println("Pay me first buddy!");
    }

    @Override
    public String toString() {
        return "waiting for a dollar...";
    }
}
