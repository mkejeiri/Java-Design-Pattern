package com.java.course.model;

public class SodaVendingMachine {
    private IState soldOutState;
    private IState noMoneyState;
    private IState hasMoneyState;
    private IState soldState;

    private IState state = soldOutState;
    private int count= 0;

   public SodaVendingMachine(int numberOfSodas) {
        this.hasMoneyState = new HasMoneyState(this);
        this.noMoneyState = new NoMoneyState(this);
        this.soldOutState = new SoldOutState(this);
        this.soldState = new SoldState(this);
        this.count = numberOfSodas;
        if (numberOfSodas>0){
            state = noMoneyState;
            System.out.println("Welcome to our Soda vending machine");
            System.out.println(count + " Sodas available in inventory");
            System.out.println("Insert a dollar to get started ...");
        }
    }

    public void insertMoney() {
        state.insertMoney();
    }

    public void ejectMoney() {
        state.ejectMoney();
    }

    public void select() {
        state.select();
    }

    public void dispense() {
        state.dispense();
    }

    public IState getSoldOutState() {
        return soldOutState;
    }

    public void setSoldOutState(IState soldOutState) {
        this.soldOutState = soldOutState;
    }

    public IState getNoMoneyState() {
        return noMoneyState;
    }

    public void setNoMoneyState(IState noMoneyState) {
        this.noMoneyState = noMoneyState;
    }

    public IState getHasMoneyState() {
        return hasMoneyState;
    }

    public void setHasMoneyState(IState hasMoneyState) {
        this.hasMoneyState = hasMoneyState;
    }

    public IState getSoldState() {
        return soldState;
    }

    public void setSoldState(IState soldState) {
        this.soldState = soldState;
    }

    public IState getState() {
        return state;
    }

    public void setState(IState state) {
        this.state = state;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nThe soda machine, co");
        result.append("\nInventory: "+count+ " soda");
        if (count !=1){
         result.append("s");
        }
        result.append("\nSoda vending machine is "+state+"\n");
        return result.toString();
    }
}
