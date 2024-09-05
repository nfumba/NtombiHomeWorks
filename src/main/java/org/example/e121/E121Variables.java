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
            instance1.doubleValue = 10.23;
            instance1.charValue = 'a';

            // Print values of the first instance
            System.out.println("Int Value: " + instance1.intValue);
            System.out.println("Double Value: " + instance1.doubleValue);
            System.out.println("Char Value: " + instance1.charValue);

            // Assign values to variables for the second instance
            instance2.intValue = 100;
            instance2.doubleValue = 100.23;
            instance2.charValue = 's';

            // Print values of the second instance
            System.out.println("Int Value: " + instance2.intValue);
            System.out.println("Double Value: " + instance2.doubleValue);
            System.out.println("Char Value: " + instance2.charValue);

        }
    }
}
