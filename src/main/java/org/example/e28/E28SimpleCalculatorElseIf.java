package org.example.e28;
public class E28SimpleCalculatorElseIf {
    public static void main(String[] args) {
        // Declare a variable for operator and assign a value
        String operator = "*";
        // Declare two variables for numbers and assign values
        int num1 = 2;
        int num2 = 25;
        // Perform the corresponding arithmetic operation
        if (operator.equals("+")) {
            int result = num1 + num2;
            System.out.println("The sum is: " + result);
        } else if (operator.equals("-")) {
            int result = num1 - num2;
            System.out.println("The difference is: " + result);
        } else if (operator.equals("*")) {
            int result = num1 * num2;
            System.out.println("The product is: " + result);
        } else if (operator.equals("/")) {
            if (num2 != 0) {
                double result = (double) num1 / num2;
                System.out.println("The quotient is: " + result);
            } else {
                System.out.println("Error: Division by zero");
            }
        } else {
            System.out.println("Invalid operator");
        }
    }
}
