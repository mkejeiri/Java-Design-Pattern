package com.java.course.Catalog;

import com.java.course.iterator.GeekyStoreIterator;
import com.java.course.iterator.ICatalog;
import com.java.course.iterator.Iterator;
import com.java.course.model.Product;
import java.util.ArrayList;

public class GeekyStoreCatalog implements ICatalog<Product> {
   private ArrayList<Product> catalog;



    public GeekyStoreCatalog() {
        catalog = new ArrayList();
        addItem("Superman Comic","The best in town",12.99);
        addItem("Batman Comic","Okay, but still good ",9.99);
        addItem("Star wars","Can't live without it",14.67);
        addItem("Jedi T-shirt","Gotta Have it",13.79);
    }
    public void addItem(String name, String description, double price){
        Product product = new Product(name, description, price);
            catalog.add(product);
        }
    //NO NEED FOR getCatalog() since we return an iterator (GetGeekyStoreIterator)!
    /*public ArrayList<Product> getCatalog() {return catalog;}*/
    private Iterator<Product> GetGeekyStoreIterator(){
        return new GeekyStoreIterator(catalog);
    }

    @Override
    public Iterator<Product> getIterator() {
        return this.GetGeekyStoreIterator();
    }
}


