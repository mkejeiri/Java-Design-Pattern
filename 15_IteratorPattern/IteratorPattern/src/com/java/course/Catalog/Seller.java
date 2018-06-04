package com.java.course.Catalog;

import com.java.course.iterator.ICatalog;
import com.java.course.iterator.Iterator;
import com.java.course.model.Product;

/*
* Client = seller doesn't need to know how the data is been saved or where it comes from
* the seller knows only which catalog to display but not how to display it!
* */
public class Seller implements ICatalog<Product> {
    private ICatalog<Product> geekyStoreCatalog;
    private ICatalog<Product> devStoreCatalog;

    public Seller(GeekyStoreCatalog geekyStoreCatalog, DevStoreCatalog devStoreCatalog) {
        this.geekyStoreCatalog = geekyStoreCatalog;
        this.devStoreCatalog = devStoreCatalog;
    }

    public void printCatalog(){
        System.out.println("printing catalog: ");
        printCatalog(devStoreCatalog.getIterator());
        printCatalog( geekyStoreCatalog.getIterator());
    }
    private void printCatalog(Iterator<Product> iterator){
        System.out.println("===================================================");
        while ( iterator.hasNext()){
            Product product = iterator.next();
            System.out.print(product.getName() +" ");
            System.out.print(product.getDescription() + " ");
            System.out.print(product.getPrice() + " \n");
        }
    }

    @Override
    public Iterator<Product> getIterator() {
        return null;
    }
}
