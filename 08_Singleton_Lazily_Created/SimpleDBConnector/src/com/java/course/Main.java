package com.java.course;
public class Main {
    public static void main(String[] args) {
        System.out.println("Creating a singleton connection to DB");
        DBConnector dbConnector = DBConnector.getInstance();
        dbConnector.userConnect();
    }
}
