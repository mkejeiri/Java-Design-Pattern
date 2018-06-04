package com.java.course;
public class DBConnector {
    //Eagerly creating a DBConnector instance
    //synchronisation is a way expensive, we need to minimize it overhead!
    //the idea is to check if an instance is created and then synchronized
    private static DBConnector uniquedbcon = new DBConnector();
     private DBConnector() {
    }

    public static DBConnector getInstance(){
        return uniquedbcon;
    }
    public void userConnect(){
        System.out.println("user is connected to db! : Object @  = " + uniquedbcon);
    }
}
