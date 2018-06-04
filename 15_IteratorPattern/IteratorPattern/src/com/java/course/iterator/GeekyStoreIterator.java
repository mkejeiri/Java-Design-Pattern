package com.java.course.iterator;
import com.java.course.model.Product;

import java.util.ArrayList;

public class GeekyStoreIterator implements Iterator<Product> {
    private ArrayList<Product> catalog;
    private int position = 0;

    public GeekyStoreIterator(ArrayList<Product> catalog) {
        this.catalog = catalog;
    }

    @Override
    public boolean hasNext() { return !(position>=catalog.size()|| catalog.get(position) == null);}

    @Override
    public Product next() {
        position++;
        return catalog.get(position-1);}

    @Override
    public void remove() {
        if (position<=0){
            throw  new IllegalStateException("Can't remove an item until you've done at least one next()");
        }else {
            catalog.remove(position);
            }
        }
    }

