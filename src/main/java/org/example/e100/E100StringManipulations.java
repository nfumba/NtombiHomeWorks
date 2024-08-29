package org.example.e100;

import java.util.Scanner;

public class E100StringManipulations {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);
        // Prompt the user to input a string
        System.out.println("In: ");
        // Read the input string
        String input = scanner.nextLine();
        // Reverse the String using a for loop
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        // Print the Result
        System.out.println(reversed);
    }
}


