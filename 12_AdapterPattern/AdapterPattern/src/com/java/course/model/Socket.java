package com.java.course.model;

//Adaptee
public class Socket {
    public Volt getVolt(){
        return new Volt(120);
    }
}
