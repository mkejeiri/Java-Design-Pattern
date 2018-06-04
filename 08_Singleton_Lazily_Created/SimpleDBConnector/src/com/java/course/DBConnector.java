package com.java.course;
public class DBConnector {
    private static DBConnector uniquedbcon;
     private DBConnector() {
    }
    //synchronized keyword: make this method thread safe but it goes with an overhead, beware also of deadlock problem
    //here we lazily create our singleton
    public static synchronized DBConnector getInstance(){
        if (uniquedbcon == null){
            uniquedbcon = new DBConnector();
        }
        return uniquedbcon;
    }


    public void userConnect(){
        System.out.println("user is connected to db! : Object @  = " + uniquedbcon);
    }
}
