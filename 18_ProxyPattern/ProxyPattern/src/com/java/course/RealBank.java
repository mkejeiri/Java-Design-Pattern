package com.java.course;

import java.util.ArrayList;

public class RealBank implements IBank{
    @Override
    public void withdrawMoney(String clientName) throws Exception {
        System.out.println(clientName + " is withdrawing from ATM...");
    }
}
