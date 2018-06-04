package com.kejeiri.Core;
public enum HamburgerTypes {
    CHEESE("cheese"),
    GREEK("greek"),
    MEAT ("meatlover"),
    VEGGIE ("veggie"),
    BUNLESS("bunless");

    private final String name;

    HamburgerTypes(String name) {
        this.name = name;
    }

  /*  public boolean equalsName(String otherName) {
        return this.name.equals(otherName);
    }*/

    public String toString() {
        return this.name;
    }
}