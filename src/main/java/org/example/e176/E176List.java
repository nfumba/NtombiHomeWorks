package org.example.e176;

import java.util.ArrayList;


public class E176List {
    public static void main(String[] args){
        ArrayList<Integer> productIDs = new ArrayList<>();

        // Add product IDs to the list
        productIDs.add(111);
        productIDs.add(222);
        productIDs.add(333);
        productIDs.add(444);
        productIDs.add(555);
        productIDs.add(666);

        // Print the list of product IDs
        System.out.println(productIDs);

        // Clear the inventory
        productIDs.clear();

        // Print the empty list
        System.out.println(productIDs);
    }
}
