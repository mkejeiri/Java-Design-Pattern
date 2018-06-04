package com.kejeiri.Core;

import com.kejeiri.model.Hamburger;

public class HamburgerStore {
   private SimpleHamburgerFactory simpleHamburgerFactory;

    public HamburgerStore(SimpleHamburgerFactory simpleHamburgerFactory) {
        this.simpleHamburgerFactory = simpleHamburgerFactory;
    }

    public Hamburger orderHamburger(String type){
        System.out.println("Ordering "+ type + " burger");
        Hamburger burger =  simpleHamburgerFactory.createHamburger(type);
        burger.prepare();
        burger.cook();
        burger.box();
        System.out.println("picking up order");
        return burger;
    }
}
