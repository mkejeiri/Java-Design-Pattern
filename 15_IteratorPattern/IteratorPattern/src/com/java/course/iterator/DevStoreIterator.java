package com.java.course.iterator;
import com.java.course.model.Product;

public class DevStoreIterator implements Iterator<Product> {
    private Product[] catalog;
    private int position = 0;

    public DevStoreIterator(Product[] catalog) {
        this.catalog = catalog;
    }

    @Override
    public boolean hasNext() {return !(position>=catalog.length || catalog[position] == null);}

    @Override
    public Product next() {
        position++;
        return catalog[position-1];
    }

    @Override
    public void remove() {
        if (position<=0){
            throw  new IllegalStateException("Can't remove an item until you've done at least one next()");
        }else {
          if (catalog[position-1] == null){
                for (int i = position-1; i <catalog.length-1 ; i++) {
                    catalog[i] = catalog[i+1];
                }
                catalog[catalog.length-1] = null;
          }
        }
    }

}
