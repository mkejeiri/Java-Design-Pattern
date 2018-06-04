package com.java.course.model;

public class SoldState implements IState {
    private SodaVendingMachine sodaVendingMachine;

    public SoldState(SodaVendingMachine sodaVendingMachine) {
        this.sodaVendingMachine = sodaVendingMachine;
    }

    @Override
    public void insertMoney() {
        System.out.println("give a second soda coming right up");

    }

    @Override
    public void ejectMoney() {
        System.out.println("Nope... you can't eject the money if you already have the soda");
    }

    @Override
    public void select() {
        System.out.println("sorry the soda is coming!");
        sodaVendingMachine.setCount(sodaVendingMachine.getCount()-1);
    }

    @Override
    public void dispense() {
        System.out.println("Stop trying to get a second soda for free");
        if (sodaVendingMachine.getCount()>0){
            sodaVendingMachine.setState(sodaVendingMachine.getNoMoneyState());
        }else{
            System.out.println("Sorry... out of soda!");
            sodaVendingMachine.setState(sodaVendingMachine.getSoldOutState());
        }
    }

    @Override
    public String toString() {
        return "Dispensing soda";
    }
}
