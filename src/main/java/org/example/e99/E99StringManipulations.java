package org.example.e99;

import java.util.Scanner;

public class E99StringManipulations {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input a string
        System.out.println("Please enter a string:");

        // Read the input string
        String input = scanner.nextLine();
        // Remove all spaces and convert the string to lowercase
        String cleanedInput = input.replaceAll("\\s", "").toLowerCase();

        // Check if the string is a palindrome


        // Print "true" if the string is a palindrome, and "false" otherwise
        // Step 2: Create a Scanner object to read input from the console
        boolean isPalindrome = cleanedInput.equals(new StringBuilder(cleanedInput).reverse().toString());

        System.out.println(isPalindrome);

    }
}
