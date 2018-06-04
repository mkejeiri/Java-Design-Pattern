package com.java.course;

import com.java.course.model.Animal;
import com.sun.org.apache.bcel.internal.generic.ANEWARRAY;

public class Main {

    public static void main(String[] args) {
        System.out.println("Custom cloning");
        Person person = new Person("kejeiri",40);
        System.out.println("person 1 : " + person);

        Person ahmed =(Person)person.clone();
        ahmed.setName("Ahmed");
        System.out.println("person 2 : " + ahmed);

        Dolphin dolphin = new Dolphin("Jerry",70);
        System.out.println("Dolphin 1 " + dolphin);

        Dolphin sam = (Dolphin) dolphin.clone();
        sam.setName("Sam");
        System.out.println("Dolphin 2 " + sam);

        System.out.println("====================================================");
        System.out.println("Using cloneable From JAVA");
        Animal animal = new Animal("Cow",3);
        System.out.println(animal);
        Animal cow = (Animal) animal.clone();
        cow.setName("new cow");
        System.out.println(cow);
        System.out.println(System.identityHashCode(animal));
        System.out.println(System.identityHashCode(cow));







    }
}
