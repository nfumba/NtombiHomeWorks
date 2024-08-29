package org.example.e105;

import java.util.Scanner;

public class E105StringManipulations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the User for Input
        System.out.println("In:");

        // Read the input string
        String input = scanner.nextLine();

        // Print Only Vowels
        for (char c : input.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                System.out.print(c);
            }
        }
        System.out.println();
    }
}

