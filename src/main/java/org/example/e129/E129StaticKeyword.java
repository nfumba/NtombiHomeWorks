package org.example.e129;

public class E129StaticKeyword {
    public static String countryName;
    public static String continent;

    // Create static method
    public static void display() {
        System.out.println(countryName + " located on " + continent + " continent");
    }

    public static void main(String[] args) {
        // Assign values to static variables
        countryName = "Morocco";
        continent = "Africa";

        // Execute display method
        display();
    }
}
