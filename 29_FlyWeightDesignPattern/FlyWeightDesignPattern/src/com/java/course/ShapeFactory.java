package com.java.course;

import java.util.HashMap;

public class ShapeFactory {
    private static final HashMap<String, Circle> circleMap= new HashMap();
    public static Shape getCircle(String color){
        Circle circle = circleMap.get(color);
        if (circle == null){
            circle = new Circle(color);
            circleMap.put(color,circle);
            System.out.println("Making circle of color: "+color);
        }
        return circle;
    }
}
