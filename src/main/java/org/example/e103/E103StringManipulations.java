package org.example.e103;

import java.util.Scanner;

public class E103StringManipulations {
    public static void main(String[] args) {
            // Create a Scanner object to read input from the console
            Scanner scanner = new Scanner(System.in);

            // Prompt the user to input a string
            System.out.println("In:");

            // Read the input string
            String input = scanner.nextLine();

            // Print Each Character Separated by Spaces using a for loop
        for (int i = 0; i < input.length(); i++) {
            System.out.print(input.charAt(i));
            if (i < input.length() - 1) { // Check if it's not the last character
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}



