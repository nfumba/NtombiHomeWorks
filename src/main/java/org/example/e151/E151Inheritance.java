package org.example.e151;

public class E151Inheritance {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("John Doe", 1000, "123456789", 0.05);
        savingsAccount.deposit(500);
        savingsAccount.applyInterest();
        savingsAccount.printAccountInfo();

        CheckingAccount checkingAccount = new CheckingAccount("Jane Smith", 100, "987654321", 500);
        checkingAccount.withdraw(200);
        checkingAccount.printAccountInfo();
    }
}

class BankAccount {
    private String accountHolderName;
    private double balance;
    private String accountNumber;

    public BankAccount(String accountHolderName, double balance, String accountNumber) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public void printAccountInfo() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountHolderName, double balance, String accountNumber, double interestRate) {
        super(accountHolderName, balance, accountNumber);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        double interest = getBalance() * interestRate;
        deposit(interest);
    }
}

class CheckingAccount extends BankAccount {
    private double overdraftLimit;

    public CheckingAccount(String accountHolderName, double balance, String accountNumber, double overdraftLimit) {
        super(accountHolderName, balance, accountNumber);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= -overdraftLimit) {
            super.withdraw(amount);
        } else {
            System.out.println("Overdraft limit exceeded");
        }
    }
}
