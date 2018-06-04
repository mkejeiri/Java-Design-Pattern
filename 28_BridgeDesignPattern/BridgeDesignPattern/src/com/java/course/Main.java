package com.java.course;

public class Main {

    public static void main(String[] args) {
        Vehicle audi = new Car(new Make(),new Assemble());
        audi.manufucture();

        Vehicle vtt = new Bike(new Make(),new Assemble());
        vtt.manufucture();
    }
}
