package org.example.e181;


import java.util.ArrayList;
import java.util.Iterator;


public class E181List {
    public static void main(String[] args) {
        // Initialize ArrayList to store task statuses
        ArrayList<Boolean> listA = new ArrayList<>();

        // Add task statuses to listA
        listA.add(true);
        listA.add(false);
        listA.add(false);

        // Copy task statuses from listA to listB
        ArrayList<Boolean> listB = new ArrayList<>(listA);

        // Use Iterator to print task statuses from listB
        Iterator<Boolean> iterator = listB.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
    }

}
