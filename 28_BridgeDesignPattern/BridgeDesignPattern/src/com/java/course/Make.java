package com.java.course;


/*
 * The implementation is platform independent (car or bike doesn't matter)
 * */
public class Make implements Workshop{
    @Override
    public void make() {
        System.out.println("Making...");
    }
}
