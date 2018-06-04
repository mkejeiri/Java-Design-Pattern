package com.java.course;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        CEOPurchasePower ceo= new CEOPurchasePower();
        DirectorPurchasePower director = new DirectorPurchasePower();
        ManagerPurchasePower manager = new ManagerPurchasePower();

        ceo.setSuccessor(director);
        director.setSuccessor(ceo);
        manager.setSuccessor(director);
        while (true){
            System.out.println("Enter the amount to check who should approved your expenditure:");
            System.out.print(">>");
            try {
                double d = Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine());
                manager.processRequest(new PurchaseRequest(d,"general expenditure"));
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


    }
}
