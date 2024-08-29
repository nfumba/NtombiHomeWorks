package org.example.e48;

public class E48WhileLoop {
    public static void main(String[] args) {
        // Declare a counter variable and set it to 1
        int counter = 1;
        // Use a while loop to print even numbers from 1 to 13
        while (counter <= 13) {
            // Inside the loop, use an if statement to check if counter is even
            if (counter % 2 == 0) {
                // If counter is even, print the value of counter
                System.out.println(counter);
                // Increment the counter by 1
            }
                counter++;

        }
    }
}
