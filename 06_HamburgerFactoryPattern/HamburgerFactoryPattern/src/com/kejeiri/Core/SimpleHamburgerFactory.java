package com.kejeiri.Core;

import com.kejeiri.model.*;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class SimpleHamburgerFactory {
    public static final  String CHEESE="cheese";
    public static final  String GREEK="greek";
    public static final  String MEAT="meatlover";
    public static final  String VEGGIE="veggie";
    public static final  String BUNLESS="bunless";

    public Hamburger createHamburger(String type){
        Hamburger burger = null;
        switch (type) {
            case CHEESE:
                burger = new CheeseBurger();
                break;
            case GREEK:
                burger = new GreekBurger();
                break;
            case MEAT:
                burger = new MeatLover();
                break;
           case VEGGIE:
                burger = new VeggieBurger();
                break;
           case BUNLESS:
                burger = new BunLessBurger();
                break;
            default:
                throw new NotImplementedException();
        }
        return burger;
    }
}
