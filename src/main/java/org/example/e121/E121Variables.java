package org.example.e121;

public class E121Variables {
    // Declare 3 instance variables: integer, double, and char
    public static class MyClass {
        int intValue;
        double doubleValue;
        char charValue;


        public static void main(String[] args) {
            // Create 2 instances of the class
            // Create 2 instances of the class
            MyClass instance1 = new MyClass();
            MyClass instance2 = new MyClass();

            // Assign values to variables for the first instance
            instance1.intValue = 10;
            instance1.doubleValue = 20.5;
            instance1.charValue = 'A';

            // Print values of the first instance
            System.out.println("Instance 1:");
            System.out.println("Int Value: " + instance1.intValue);
            System.out.println("Double Value: " + instance1.doubleValue);
            System.out.println("Char Value: " + instance1.charValue);

            // Assign values to variables for the second instance
            instance2.intValue = 30;
            instance2.doubleValue = 40.75;
            instance2.charValue = 'B';

            // Print values of the second instance
            System.out.println("\nInstance 2:");
            System.out.println("Int Value: " + instance2.intValue);
            System.out.println("Double Value: " + instance2.doubleValue);
            System.out.println("Char Value: " + instance2.charValue);

        }
    }
}
