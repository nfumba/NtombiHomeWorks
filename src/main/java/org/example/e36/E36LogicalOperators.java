package org.example.e36;

import java.util.Scanner;

public class E36LogicalOperators {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Print prompt for user to enter their monthly rent expense
        System.out.println("Please enter your monthly rent expense");
        // Capture the rent expense input
        double rentExpense = scanner.nextDouble();
        // Print prompt for user to enter their monthly food expense
        System.out.println("Please enter your monthly food expense: ");

        // Capture the food expense input
        double foodExpense = scanner.nextDouble();

        // Print prompt for user to enter their monthly transportation expense
        System.out.println("Please enter your monthly transportation expense");

        // Capture the transportation expense input
        double transportationExpense = scanner.nextDouble();

        // Print prompt for user to enter their monthly entertainment expense
        System.out.println("Please enter your monthly entertainment expense");

        // Capture the entertainment expense input
        double entertainmentExpense = scanner.nextDouble();
        if (rentExpense > foodExpense && transportationExpense > entertainmentExpense) {
            System.out.println("You are prioritizing essentials well.");
        } else if (rentExpense > foodExpense || transportationExpense > entertainmentExpense) {
            System.out.println("You are on the right track, but could improve.");
        } else {
            System.out.println("You need to rethink your spending priorities.");
        }

        // Close the Scanner object
        scanner.close();
    }
}
