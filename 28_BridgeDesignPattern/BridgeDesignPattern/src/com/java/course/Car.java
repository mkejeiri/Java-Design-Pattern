package com.java.course;

public class Car extends Vehicle{
    public Car(Workshop manufactureLine, Workshop assemblyLine) {
        super(manufactureLine, assemblyLine);
    }

    @Override
    public void manufucture() {
        System.out.println("Car...");
        manufactureLine.make();
        assemblyLine.make();
    }
}
