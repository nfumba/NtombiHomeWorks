package org.example.e25;

public class E25DailyExpenseTrackerIfConditions {
    public static void main(String[] args) {
        // Assign values to daily expenses
        double morningExpense=20.00;
        double afternoonExpense=6.25;
        double eveningExpense=50.00;

        // Calculate total expense
        double totalExpense=morningExpense+afternoonExpense+eveningExpense;

        // Define a budget
       double budget=100;
        System.out.println("Your total daily expense is:"+" "+totalExpense);
        // Check if within budget
        if(budget>100){
            System.out.println("Oops you have overspent");
        } else if (budget<=100) {
            System.out.println("You are within the budget.");
        }


    }
}
