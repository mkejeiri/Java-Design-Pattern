package com.kejeiri;

import com.kejeiri.Core.HamburgerTypes;
import com.kejeiri.Core.JamHamburgerStore;
import com.kejeiri.Core.HamburgerStore;
import com.kejeiri.Core.MozHamburgerStore;
import com.kejeiri.model.Hamburger;

public class Main {
    public static void main(String[] args) {
        HamburgerStore hs = new JamHamburgerStore();
       Hamburger hamburger = hs.orderHamburger(HamburgerTypes.CHEESE.name());
        System.out.println("I ordered " + hamburger.getName());


        hs = new MozHamburgerStore();
        hamburger= hs.orderHamburger(HamburgerTypes.VEGGIE.name());
        System.out.println("I ordered " + hamburger.getName());

    }
}
