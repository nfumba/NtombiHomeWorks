package org.example.e122;

public class E122Variables {

    // Declare 3 instance variables: name of the countryName, capital, and populationSize
    public static class Country {
        String countryName;
        String capital;
        int populationSize;

        // Create a method to display values of instance variables
        public void display() {
            System.out.println("The capital of " + countryName + " is " + capital + " and population is " + populationSize);
        }

        public static void main(String[] args) {
            // Create 2 instances of the class
            Country country1 = new Country();
            Country country2 = new Country();
            // Assign values to variables for the first instance
            country1.countryName = "USA";
            country1.capital = "Washington DC";
            country1.populationSize = 330000000;

            // Execute the method to display values for the first instance
            country1.display();
            // Assign values to variables for the second instance
            country2.countryName = "Kazakhstan";
            country2.capital = "Astana";
            country2.populationSize = 18500000;

            // Execute the method to display values for the second instance
            country2.display();

        }
    }
}