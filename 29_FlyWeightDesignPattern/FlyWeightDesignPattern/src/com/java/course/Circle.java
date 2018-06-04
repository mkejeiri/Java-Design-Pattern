package com.java.course;

public class Circle  implements  Shape {
    private String color;
    private int x;
    private int y;
    private int radius;

    public Circle(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.print("Drawing circle... ");
        System.out.print (", Color: = " +color);
        System.out.print (", X: = " +x);
        System.out.print (", Y: = " + y);
        System.out.println(", Radius: = " + radius);

    }
}
