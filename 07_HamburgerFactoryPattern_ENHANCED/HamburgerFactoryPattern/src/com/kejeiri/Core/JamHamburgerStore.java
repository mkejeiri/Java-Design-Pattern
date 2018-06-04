package com.kejeiri.Core;
import com.kejeiri.model.*;

public class JamHamburgerStore extends HamburgerStore {
     @Override
    public Hamburger createHamburger(String type) {
        Hamburger burger = null;
        if (HamburgerTypes.CHEESE.name().equals(type)){
            burger = new JamCheeseBurger();
            return burger;
        }
        if (HamburgerTypes.GREEK.name().equals(type)){
            burger = new JamGreekBurger();
            return burger;
        }
        if (HamburgerTypes.MEAT.name().equals(type)){
            burger = new JamMeatLover();
            return burger;
        }

        if (HamburgerTypes.VEGGIE.name().equals(type)){
            burger = new JamVeggieBurger();
            return burger;
        }

        if (HamburgerTypes.BUNLESS.name().equals(type)){
            burger = new JamBunLessBurger();
            return burger;
        }
        System.out.println("burger : "+type+" not available!");
        return burger;
    }

    @Override
    public Hamburger orderHamburger(String type) {
        return super.orderHamburger(type);
    }
}
