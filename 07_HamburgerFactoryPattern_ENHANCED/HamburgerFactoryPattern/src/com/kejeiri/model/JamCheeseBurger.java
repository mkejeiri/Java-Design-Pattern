package com.kejeiri.model;

public class JamCheeseBurger extends Hamburger {
    public JamCheeseBurger() {
        this.setName("Jamaican cheese burger");
        this.setSauce("Jamaican sauce style");
        this.setBuns("Cookie dough buns!");
    }

    @Override
    public void prepare() {
        System.out.println("Preparing Jamaican "+this.getName());
        System.out.println("Adding sauce Jamaican "+this.getSauce());
        System.out.println("Adding burns Jamaican "+this.getBuns());
    }

    @Override
    public void cook() {
        System.out.println("Cooking jamaican style burger");
    }

    @Override
    public void box() {
        System.out.println("Boxing jamaican style burger");
    }
}
