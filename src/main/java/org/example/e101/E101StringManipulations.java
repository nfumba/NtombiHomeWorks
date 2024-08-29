package org.example.e101;

import java.util.Scanner;

public class E101StringManipulations {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);
        // Prompt the user to input a string
        System.out.println("In: ");
        // Read the input string
        String input = scanner.nextLine();


        // Print Every Other Letter using a for loop
        for (int i = 0; i < input.length(); i += 2) {
            System.out.print(input.charAt(i));
        }
        System.out.println();
    }
}
