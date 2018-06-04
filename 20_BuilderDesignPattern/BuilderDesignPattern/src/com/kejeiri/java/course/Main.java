package com.kejeiri.java.course;

public class Main {

    public static void main(String[] args) {
        User user = new User.UserBuilder("Mohamed","kejeiri")
                .age(40)
                .address("Brussels")
                .phone("+34545477888")
                .build();
        System.out.println(user);

    }
}
