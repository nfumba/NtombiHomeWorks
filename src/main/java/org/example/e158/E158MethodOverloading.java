package org.example.e158;
public class E158MethodOverloading {
    public static void main(String[] args) {
        LoanPaymentCalculator calculator = new LoanPaymentCalculator();
        System.out.println(String.format("%.2f", calculator.calculatePayment(10000, 5)));
        System.out.println(String.format("%.2f", calculator.calculatePayment(10000, 5, 24)));
        System.out.println(String.format("%.2f", calculator.calculatePayment(10000, 5, 24, 2000)));
    }
}

class LoanPaymentCalculator {
    public double calculatePayment(double loanAmount, double interestRate) {
        return (loanAmount * (1 + interestRate / 100)) / 12;
    }

    public double calculatePayment(double loanAmount, double interestRate, double numberOfMonths) {
        return (loanAmount * (1 + interestRate / 100)) / numberOfMonths;
    }

    public double calculatePayment(double loanAmount, double interestRate, double numberOfMonths, double downPayment) {
        return ((loanAmount - downPayment) * (1 + interestRate / 100)) / numberOfMonths;
    }
}


