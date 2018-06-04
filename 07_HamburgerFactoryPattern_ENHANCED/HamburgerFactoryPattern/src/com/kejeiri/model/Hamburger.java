package com.kejeiri.model;

public abstract class Hamburger {
   private String name;
    private String sauce;
    private String buns;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public String getBuns() {
        return buns;
    }

    public void setBuns(String buns) {
        this.buns = buns;
    }

    public void prepare(){
        System.out.println("Preparing "+name);
        System.out.println("Adding sauce "+sauce);
        System.out.println("Adding burns "+buns);
    }

    public void cook(){
        System.out.println("Cooking...");
    }
    public void box(){
        System.out.println("Boxing...");
    }
}
