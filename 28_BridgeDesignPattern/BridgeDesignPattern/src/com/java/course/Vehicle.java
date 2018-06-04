package com.java.course;

 abstract class Vehicle {
    Workshop manufactureLine;
    Workshop assemblyLine;

    public Vehicle(Workshop manufactureLine, Workshop assemblyLine) {
        this.manufactureLine = manufactureLine;
        this.assemblyLine = assemblyLine;
    }

    public abstract void manufucture();
}
