package com.java.course;

import com.java.course.Catalog.DevStoreCatalog;
import com.java.course.Catalog.GeekyStoreCatalog;
import com.java.course.Catalog.Seller;
import com.java.course.model.Product;

public class Main {

    public static void main(String[] args) {
        //Merging two Inventories DevStoreCatalog & GeekyStoreCatalog
        //solution one: not optimal if adding add type of collection say 'HashMap' than we have to handle again
        //the iteration over the inventory -> hence the use of the iterator

        DevStoreCatalog devStoreCatalog = new DevStoreCatalog();
        //Product[] devCatalog= devStoreCatalog.getCatalog();


        GeekyStoreCatalog geekyStoreCatalog = new GeekyStoreCatalog();
        //ArrayList<Product> geekyCatalog = geekyStoreCatalog.getCatalog();


     /* for (int i = 0; i <devCatalog.length ; i++) {
            Product product = devCatalog[i];
            System.out.print(product.getName() +" ");
            System.out.print(product.getDescription() + " ");
            System.out.print(product.getPrice() + " \n");
        }

        System.out.println("=====================================");
        for (int i = 0; i <geekyCatalog.size() ; i++) {
            Product product = geekyCatalog.get(i);
            System.out.print(product.getName() +" ");
            System.out.print(product.getDescription() + " ");
            System.out.print(product.getPrice() + " \n");
        }
*/
        //Solution two:  using iterator
       /* DevStoreIterator devStoreIterator = new DevStoreIterator(devCatalog);
        GeekyStoreIterator geekyStoreIterator = new GeekyStoreIterator(geekyCatalog);*/
       /* displayItems(devStoreCatalog.getDevStoreIterator());
        displayItems(geekyStoreCatalog.GetGeekyStoreIterator());*/
        Seller seller = new Seller(geekyStoreCatalog,devStoreCatalog);
        seller.printCatalog();



        //Built-in Solution two:  using iterator
       /* printInventory(Arrays.asList(devCatalog).iterator());
        printInventory(geekyCatalog.iterator());*/
    }

   /* private static void displayItems(com.java.course.iterator.Iterator<Product> iterator) {
        System.out.println("===================================================");
        while ( iterator.hasNext()){
            Product product = iterator.next();
            System.out.print(product.getName() +" ");
            System.out.print(product.getDescription() + " ");
            System.out.print(product.getPrice() + " \n");
        }
    }*/

    //Solution two:  using iterator
    //iterator enables us to encapsulate all different loops which are coupled with the nature of our inventory list.
    /*private static void printInventory(Iterator<Product> iterator) {
        System.out.println("===================================================");
        while ( iterator.hasNext()){
            Product product = iterator.next();
            System.out.print(product.getName() +" ");
            System.out.print(product.getDescription() + " ");
            System.out.print(product.getPrice() + " \n");
        }
    }*/
}
