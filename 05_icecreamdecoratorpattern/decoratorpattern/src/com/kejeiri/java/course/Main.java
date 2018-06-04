package com.kejeiri.java.course;

import com.kejeiri.java.course.imodel.IceCream;
import com.kejeiri.java.course.model.*;

public class Main {

    public static void main(String[] args) {
        IceCream basicIceCream = new BasicIceCream();
        System.out.println("Basic icecream cost: $"+basicIceCream.cost());
        //ADD vanilla to the order

        IceCream vanilla = new VanillaIceCream(basicIceCream);//wrapping vanilla
        System.out.println("vanilla icecream cost: $"+vanilla.cost());

        //add mint to the order
        IceCream mint = new MintIceCream(vanilla);
        System.out.println("adding mint icecream cost: $"+mint.cost());


        //add peanut to the order
        IceCream peanut = new PeanutIceCream(mint);
        System.out.println("adding peanut icecream cost: $"+peanut.cost());



    }
}
