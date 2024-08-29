package org.example.e87;

public class E87ClassAndObject {
    public static void main(String[] args) {

        // Create the first object of the class 'Car'
        Car c1= new Car();

        // Assign the value "Black" to the 'carColor' variable of the first object
        c1.carColor = "Black";
        // Assign the value 2019 to the 'carYear' variable of the first object
        c1.carYear= 2019;
        // Assign the value "BMW" to the 'carMake' variable of the first object
        c1.carMake="BMW";

        // Create the second object of the class 'Car'
        Car c2 = new Car();

        // Assign the value "White" to the 'carColor' variable of the second object
        c2.carColor = "White";
        // Assign the value 2018 to the 'carYear' variable of the second object
        c2.carYear = 2018;
        // Assign the value "Toyota" to the 'carMake' variable of the second object
        c2.carMake = "Toyota";

        // Print the values of the properties for both objects in the specified format
        System.out.println("Car color is"+" "+ c1.carColor+ " "+ "and car year is"+" " +c1.carYear + " " +"and car model is" + " " + c1.carMake);
        System.out.println("Car color is"+" "+ c2.carColor+ " "+ "and car year is"+" " +c2.carYear + " " +"and car model is" + " " + c2.carMake);



    }
}
