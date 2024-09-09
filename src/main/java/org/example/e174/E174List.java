package org.example.e174;

import java.util.ArrayList;

public class E174List {
    public static void main(String[] args) {
        ArrayList<Integer> productIDs = new ArrayList<>();

        // Add product IDs to the list
        productIDs.add(1011);
        productIDs.add(1022);
        productIDs.add(1033);
        productIDs.add(1044);
        productIDs.add(1055);
        productIDs.add(1066);

        // Retrieve and print specific product IDs
        System.out.println(productIDs.get(0)); // 1st product ID (1011)
        System.out.println(productIDs.get(2)); // 3rd product ID (1033)
        System.out.println(productIDs.get(4)); // 5th product ID (1055)
    }
}

