package org.example.e35;

import java.util.Scanner;

public class E35LogicalOperators {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        // Print prompt for user to answer if they need a loan
        System.out.println("Do you need a loan? (true/false)");
        // Capture the loan requirement input
        boolean needsLoan = scanner.nextBoolean();
        // Check if the user needs a loan
        int creditScore = 0;
        if (needsLoan) {
            System.out.println("What is your credit score?");
            creditScore = scanner.nextInt();
        }
        // Determine Eligibility
        String eligibility = "";
        if (needsLoan) {
            if (creditScore < 600) {
                eligibility = "Not eligible";
            } else if (creditScore >= 600 && creditScore <= 700) {
                eligibility = "Maybe eligible";
            } else if (creditScore >= 701 && creditScore <= 800) {
                eligibility = "Eligible";
            } else if (creditScore > 800) {
                eligibility = "Definitely eligible";
            }
        } else {
            eligibility = "Unknown";
        }
        // Print Eligibility
        System.out.println("The eligibility is " + eligibility);

        // Close the Scanner object
        scanner.close();
    }
}