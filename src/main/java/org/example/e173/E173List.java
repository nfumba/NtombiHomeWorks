package org.example.e173;

import java.util.ArrayList;

public class E173List {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        System.out.println(tasks.isEmpty()); // true
        tasks.add("Buy Groceries");
        System.out.println(tasks.isEmpty()); // false
    }
}
