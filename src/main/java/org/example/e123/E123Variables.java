package org.example.e123;

public class E123Variables {
    // Declare instance variables to hold integer, String, double, boolean, and float values
    public static class Main {
        int integerValue;
        String stringValue;
        double doubleValue;
        boolean booleanValue;
        float floatValue;

        public static void main(String[] args) {
            // Create an instance of the class
            Main main = new Main();

            // Access instance variables and print them without assigning any values
            System.out.println("Integer Value: " + main.integerValue);

            // Print the default values of the instance variables
            System.out.println("String Value: " + main.stringValue);
            System.out.println("Double Value: " + main.doubleValue);
            System.out.println("Boolean Value: " + main.booleanValue);
            System.out.println("Float Value: " + main.floatValue);


        }
    }
}
