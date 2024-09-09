package org.example.e175;

import java.util.ArrayList;


public class E175List {
    public static void main(String[] args){
        ArrayList<Integer> productQuantities = new ArrayList<>();

        // Add product quantities to the list
        productQuantities.add(111); // Product A, Order 1
        productQuantities.add(111); // Product A, Order 2
        productQuantities.add(111); // Product A, Order 3
        productQuantities.add(999); // Product B, Order 1
        productQuantities.add(999); // Product B, Order 2
        productQuantities.add(999); // Product B, Order 3

        // Print product quantities
        for (Integer quantity : productQuantities) {
            System.out.println(quantity);
        }
    }
}


