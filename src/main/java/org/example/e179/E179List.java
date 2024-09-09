package org.example.e179;


import java.util.LinkedList;

public class E179List {

    public static void main(String[] args){
        LinkedList<Integer> numbers = new LinkedList<>();

        // Add elements to LinkedList
        for (int i = 50; i <= 100; i++) {
            numbers.add(i);
        }

        // Remove elements not divisible by 3
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 3 != 0) {
                numbers.remove(i);
                i--;
            }
        }

        // Print the remaining elements
        System.out.println(numbers);
    }
}
