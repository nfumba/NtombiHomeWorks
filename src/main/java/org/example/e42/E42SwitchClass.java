package org.example.e42;

import java.util.Scanner;

public class E42SwitchClass {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Print prompt for user to enter the day of the week
        System.out.println("Enter the day of the week (1 for Monday, 2 for Tuesday, ..., 7 for Sunday)");
        // Capture the day of the week input
        int dayOfWeek = scanner.nextInt();

        // Suggest activity using switch statement
        switch (dayOfWeek) {
            case 1:
                System.out.println("Activity: Go to the gym");
                break;
            case 2:
                System.out.println("Activity: Attend a coding meetup");
                break;
            case 3:
                System.out.println("Activity: Go for a mid-week run");
                break;
            case 4:
                System.out.println("Activity: Take a cooking class");
                break;
            case 5:
                System.out.println("Activity: Movie night");
                break;
            case 6:
                System.out.println("Activity: Family day");
                break;
            case 7:
                System.out.println("Activity: Relax and recharge");
                break;
            default:
                System.out.println("Invalid day entered");
                break;
        }

        // Close the Scanner object
        scanner.close();
    }
}
