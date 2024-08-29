package org.example.e116;

public class E116JavaMethods {
    public static void main(String[] args) {
        // Call the bothEven method with various arguments to test the method
        System.out.println(bothEven(2, 5));


    }

    // Create method bothEven with two integer parameters
    // Inside the method, check if both numbers are even
    // Return true if both numbers are even, otherwise return false
    public static boolean bothEven(int num1, int num2) {
        // Check if both numbers are even using the modulo operator (%)
        return (num1 % 2 == 0) && (num2 % 2 == 0);
    }

}
