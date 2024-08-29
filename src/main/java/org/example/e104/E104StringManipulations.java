package org.example.e104;

import java.util.Scanner;

public class E104StringManipulations {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);
        // Create an array of String elements with a size of 5
        String[] names = new String[5];

        // Create an array of String elements with a size of 5
        // Prompt the user to input 5 names
        System.out.println("In:");
        for (int i = 0; i < names.length; i++) {
            names[i] = scanner.nextLine();
        }

        // Print First Three Characters of Each Name
        for (String name : names) {
            System.out.println(name.substring(0, Math.min(3, name.length())));
        }
    }
}

