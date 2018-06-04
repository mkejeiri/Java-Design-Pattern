package com.java.course;

import java.util.ArrayList;
/*
* Remote proxy will make sure nobody is getting money directly from the bank
* Proxy is linked to the bank through composition
* */
public class ProxyBank implements IBank{
    //no direct access from the client to the real bank, ProxyBank or surrogate(ATM) will manage this instead
    private RealBank bank = new RealBank();
    //background security check
    private static ArrayList<String> bannedClient = new ArrayList<>();
    //some business logic such checking if the client is banned!
    static{
        bannedClient.add("xxcs");
        bannedClient.add("me@me");
        bannedClient.add("@xmil.com");
    }


    @Override
    public void withdrawMoney(String clientName) throws Exception {
        if (bannedClient.contains(clientName.toLowerCase()))
        {
            throw new Exception("Access denied for " + clientName);
        }
        bank.withdrawMoney(clientName);
    }
}
