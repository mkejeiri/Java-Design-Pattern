package com.java.course;

import java.util.Random;

public class Main {
    private static final String colors[] = {"red","blue","green","pink","brown"};

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Circle circle;
        for (int i = 1; i <21 ; i++) {
            circle = (Circle)shapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(400);
            circle.draw();
        }
    }

    public static String getRandomColor(){
        double d = Math.random()*colors.length;
        return colors[(int)d];
    }

    private static  int getRandomX(){
        double d =Math.random()*100;
        return (int) d;
    }
    private static  int getRandomY(){
        double d =Math.random()*100;
        return (int) d;
    }

}
