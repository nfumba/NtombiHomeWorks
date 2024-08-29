package org.example.e65;

import java.util.Scanner;

public class E65ForLoop {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a value for x
        System.out.print("In: ");

        // Use a for loop that starts with i = x - 1 and continues while i >= 0
        int x = scanner.nextInt();
        for (int i = x - 1; i >= 0; i--) {
            // Inside the loop, print the value of i followed by a space
            System.out.print(i + " ");

        }

    }
}
