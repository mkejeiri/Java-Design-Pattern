package com.java.course.model;

public class SodaMachine {
    //states
    final static int SOLD_OUT = 0;
    final static int NO_MONEY = 1;
    final static int HAS_MONEY = 2;
    final static int SOLD = 3;
    int state = SOLD_OUT;

    public int getCount() {
        return count;
    }

    //count how many soda available
    int count= 0;

    public SodaMachine(int count) {
        this.count = count;
        if (count>0){
            state=NO_MONEY;
            System.out.println("Welcome to our Soda vending machine");
            System.out.println(count + " Sodas available in inventory");
            System.out.println("Insert a dollar to get started ...");
        }
    }
    //Actions
    public void insertMoney(){
        switch (state){
            case HAS_MONEY:
                System.out.println("you can't insert another dollar bill");
                break;
            case NO_MONEY:
                state=HAS_MONEY;
                System.out.println("you inserted a dollar");
                break;
            case SOLD_OUT:
                System.out.println("the machine is sold out.");
                break;
            case SOLD:
                System.out.println("Please wait we already preparing your soda.");
                break;
            default:
        }
    }
    public void ejectMoney(){
        switch (state){
            case HAS_MONEY:
                System.out.println("Returning a dollar bill");
                state=NO_MONEY;
                break;
            case NO_MONEY:
                System.out.println("you haven't inserted a dollar");
                break;
            case SOLD_OUT:
                System.out.println("the machine is sold out.");
                break;
            case SOLD:
                System.out.println("You've already selected a soda!");
                break;
            default:
        }
    }
    public void select(){
        switch (state){
            case HAS_MONEY:
                System.out.println("You selected a Soda!");
                state=SOLD;
                break;
            case NO_MONEY:
                System.out.println("Please insert a dollar!");
                break;
            case SOLD_OUT:
                System.out.println("the machine is sold out.");
                break;
            case SOLD:
                System.out.println("Dispensing a soda...enjoy!");
                break;
            default:
        }

    }
    //Or distribute
    public void dispense(){
        switch (state){
            case HAS_MONEY:
                System.out.println("No soda dispensed");
                break;
            case NO_MONEY:
                System.out.println("Please insert a dollar");
                break;
            case SOLD_OUT:
                System.out.println("the machine is sold out.");
                break;
            case SOLD:
                System.out.println("Dispensing a soda...enjoy!");
                count--;
                if (count == 0) {
                    System.out.println("the machine is sold out.");
                    state=SOLD_OUT;
                } else state=NO_MONEY;
                break;
            default:
        }

    }
}
