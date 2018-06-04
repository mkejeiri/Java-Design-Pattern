package com.kejeiri.model;

public class MozVeggieBurger extends Hamburger {
    public MozVeggieBurger() {
        this.setName("Mozambican veggie burger");
        this.setSauce("Mozambican sauce style");
        this.setBuns("Mozambican Cookie dough buns!");
    }

    @Override
    public void prepare() {
        System.out.println("Preparing  "+this.getName());
        System.out.println("Adding sauce  "+this.getSauce());
        System.out.println("Adding burns  "+this.getBuns());
    }

    @Override
    public void cook() {
        System.out.println("Cooking Mozambican style burger");
    }

    @Override
    public void box() {
        System.out.println("Boxing Mozambican style burger");
    }
}
