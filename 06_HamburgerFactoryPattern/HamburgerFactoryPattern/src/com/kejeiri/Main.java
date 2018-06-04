package com.kejeiri;

import com.kejeiri.Core.HamburgerStore;
import com.kejeiri.Core.JamaicanHambugerFactory;

public class Main {
    public static void main(String[] args) {
        JamaicanHambugerFactory jamaicanHambugerFactory = new JamaicanHambugerFactory();
        HamburgerStore hs = new HamburgerStore(jamaicanHambugerFactory);
        hs.orderHamburger("cheese");
    }
}
