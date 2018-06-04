package com.kejeiri.java.course;

public class User {
    private final String firstName;
    private final String lastName;
    private final int age;
    private final String address;
    private final String phone;

    public User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.address = builder.address;
        this.phone = builder.phone;
    }
    @Override
    public String toString() {
        return "Name: " + firstName +" "+lastName + "\nage:" + age + ", address: " +address + ", phone: "+phone ;
    }
    public static class UserBuilder{
        private final String firstName;
        private final String lastName;
        private  int age;
        private  String address;
        private  String phone;



        public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public UserBuilder age (int age) {
            this.age = age;
            return this;
        }

        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }
        public UserBuilder phone (String phone) {
            this.phone = phone;
            return this;
        }
        public User build() {
            return new User(this);
        }
    }
}
