package org.example.e114;

public class E114JavaMethods {
    public static void main(String[] args) {
        // Call the add method with arguments that add up to 30
        add(15, 15);

        // Call the multiply method with arguments that multiply to 30
        multiply(5, 6);

        // Call the subtract method with arguments that subtract to 20
        subtract(30, 10);
    }
    // Create method multiply with two integer parameters and a print statement to display the result
    public static void multiply(int num1, int num2) {
        System.out.println("Multiplication " + (num1 * num2));
    }

    // Create method add with two integer parameters and a print statement to display the result
    public static void add(int num1, int num2) {
        System.out.println("Addition " + (num1 + num2));
    }

    // Create method subtract with two integer parameters and a print statement to display the result
    public static void subtract(int num1, int num2) {
        System.out.println("Subtraction " + (num1 - num2));
    }


}
