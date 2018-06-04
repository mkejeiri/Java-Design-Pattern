package com.kejeiri.Core;
import com.kejeiri.model.*;

public class MozHamburgerStore  extends HamburgerStore{

    @Override
    public Hamburger orderHamburger(String type) {
        return super.orderHamburger(type);
    }

    @Override
    public Hamburger createHamburger(String type) {
        Hamburger burger = null;
        if (HamburgerTypes.CHEESE.name().equals(type)){
            burger = new MozCheeseBurger();
            return burger;
        }
        if (HamburgerTypes.GREEK.name().equals(type)){
            burger = new MozGreekBurger();
            return burger;
        }
        if (HamburgerTypes.MEAT.name().equals(type)){
            burger = new MozMeatLover();
            return burger;
        }

        if (HamburgerTypes.VEGGIE.name().equals(type)){
            burger = new MozVeggieBurger();
            return burger;
        }


        if (HamburgerTypes.BUNLESS.name().equals(type)){
            burger = new MozBunLessBurger();
            return burger;
        }
        System.out.println("burger not available!");
        return burger;
    }
}
