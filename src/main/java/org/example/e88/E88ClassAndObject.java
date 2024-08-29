package org.example.e88;

public class E88ClassAndObject {

    public static void main(String[] args) {
        // Create a class named 'Dog'

        // Declare String variables named 'breed', 'name', and 'color'

        // Declare methods named 'bark()', 'run()', and 'play()' that print messages in the specified format

        // Create the first object of the class 'Dog' with breed = "Husky", name = "AnyName", color = "AnyColor"
        Dog d1= new Dog();
        d1.breed = "Husky";
        d1.name ="Danger";
        d1.color = "Black";
        System.out.print(d1.breed + " ");
        d1.bark();
        System.out.print(d1.breed + " ");
        d1.run();
        System.out.print(d1.breed + " ");
        d1.play();


        // Create the second object of the class 'Dog' with breed = "Bulldog", name = "AnyName", color = "AnyColor"
        Dog d2 = new Dog();
        d2.breed = "Bulldog";
        d2.name = "Tiger";
        d2.color = "White";
        System.out.print(d2.breed + " ");
        d2.bark();
        System.out.print(d2.breed + " ");
        d2.run();
        System.out.print(d2.breed + " ");
        d2.play();


        // Create the third object of the class 'Dog' with breed = "Labrador", name = "AnyName", color = "AnyColor"
        Dog d3 = new Dog();
        d3.breed = "Labrador";
        d3.name = "Gorajo";
        d3.color = "Black";
        System.out.print(d3.breed + " ");
        d3.bark();
        System.out.print(d3.breed+ " ");
        d3.run();
        System.out.print(d3.breed + " ");
        d3.play();

        // Call the methods 'bark()', 'run()', and 'play()' for each object





    }
}
