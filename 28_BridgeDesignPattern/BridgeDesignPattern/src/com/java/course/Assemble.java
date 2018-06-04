package com.java.course;


/*
 * The implementation is platform independent (car or bike doesn't matter)
 * */
public class Assemble implements Workshop {
    @Override
    public void make() {
        System.out.print("...also");
        System.out.println("...Assembled");
    }
}
