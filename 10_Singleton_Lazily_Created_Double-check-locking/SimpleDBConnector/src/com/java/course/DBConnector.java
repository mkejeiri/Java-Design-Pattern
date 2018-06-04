package com.java.course;
public class DBConnector {
    //Eagerly creating a DBConnector instance
    //synchronisation is a way expensive, we need to minimize it overhead!
    //the idea is to check if an instance is created and then synchronized
    //private static DBConnector uniquedbcon = new DBConnector();
     private DBConnector() {
    }
    //volatile ensure that multiple thread handle the unique instance variable when it
    //initialize correctly to the singleton instance

    /*
    * double-check locking make sure that an instance is safe thread created without overhead.
    * double-check locking allow us to synchronized/lock the class until the instance is created!
    * */
    private volatile static DBConnector uniquedbcon ;
    public static DBConnector getInstance(){
        if (uniquedbcon == null) {
            synchronized ((DBConnector.class)) {
                if (uniquedbcon == null){
                    uniquedbcon = new DBConnector();
                }
            }
        }
        return uniquedbcon;
    }
    public void userConnect(){
        System.out.println("user is connected to db! : Object @  = " + uniquedbcon);
    }
}
