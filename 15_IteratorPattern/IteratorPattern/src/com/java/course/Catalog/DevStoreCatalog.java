package com.java.course.Catalog;

import com.java.course.iterator.DevStoreIterator;
import com.java.course.iterator.ICatalog;
import com.java.course.iterator.Iterator;
import com.java.course.model.Product;

public class DevStoreCatalog implements ICatalog<Product> {
    private static final int MAX_ITEMS=4;
    private int numberOfProducts=0;
    private Product[] catalog;


    //Helper method
    public void addItem(String name, String description, double price){
        Product product = new Product(name, description, price);
        if (numberOfProducts>= MAX_ITEMS){
            System.out.println("Catalog list is full - can't add products.");
        }else {
            catalog[numberOfProducts] = product;
            numberOfProducts++;
        }
    }

    public DevStoreCatalog() {
        catalog = new Product[MAX_ITEMS];
        addItem("C++ is not DEAD yet!","T-shirt",39.99);
        addItem("Java rocks, yes","Silky mouse-pad",19.99);
        addItem("Java Design pattern","Book - A must",39.99);
        addItem("Web development cookbook","The best development dev cookbook - 2018",58.99);
    }
    //NO NEED FOR getCatalog() since we return an iterator (getDevStoreIterator)!
    /*public Product[] getCatalog() {return catalog;}*/
    private Iterator<Product> getDevStoreIterator(){
        return  new DevStoreIterator(catalog);
    }

    @Override
    public Iterator<Product> getIterator() {
        return this.getDevStoreIterator();
    }
}
