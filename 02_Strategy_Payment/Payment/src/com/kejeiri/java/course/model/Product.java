package com.kejeiri.java.course.model;

public class Product {
    private String upcCode;
    private int price;

    public String getUpcCode() {
        return upcCode;
    }

    public void setUpcCode(String upcCode) {
        this.upcCode = upcCode;
    }

    public int getPrice() {
        return price;
    }

    public Product() {
    }

    public Product(String upcCode, int price) {
        this.upcCode = upcCode;
        this.price = price;
    }
}
