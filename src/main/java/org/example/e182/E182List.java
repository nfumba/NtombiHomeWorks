package org.example.e182;

import java.util.LinkedList;

public class E182List {
    public static void main(String[] args) {
        LinkedList<Integer> primeNumbers = new LinkedList<>();

        // Add all prime numbers to the LinkedList
        for (int i = 1; i <= 100; i++) {
            if (isPrime(i)) {
                primeNumbers.add(i);
            }
        }

        // Print the LinkedList of prime numbers
        System.out.println(primeNumbers);
    }

    // Method to check prime numbers
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
