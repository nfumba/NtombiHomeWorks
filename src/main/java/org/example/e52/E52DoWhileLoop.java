package org.example.e52;

public class E52DoWhileLoop {
    public static void main(String[] args) {
        // Declare a counter variable and set it to 0
        int counter=0;

        // Use a do-while loop to print "Hello World!" 5 times
        do {
            // Inside the loop, print "Hello World!"
            System.out.println("Hello World!");
            // Increment the counter by 1
            counter++;
        }
        while(counter<5);

    }
}
