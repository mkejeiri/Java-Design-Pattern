package com.kejeiri.java.course;

public class Main {

    public static void main(String[] args) {
        IPerson person = new IPerson.Builder("mohamed","kejeiri")
                .age(34)
                .address("Brussels")
                .phone("003469898")
                .build();

        System.out.println(person);
    }
}
