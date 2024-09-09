package org.example.e168;

public class E168MultipleInterface {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(0);
        account.deposit(100);
        account.withdraw(50);
        account.checkBalance();
        account.withdraw(100);
    }
}

interface Transaction {
    void processTransaction(double amount);
}

interface BankOperations extends Transaction {
    double deposit(double amount);
    double withdraw(double amount);
    double checkBalance();
}

class BankAccount implements BankOperations {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void processTransaction(double amount) {
        System.out.println("Transaction successful: " + (amount > 0 ? "Deposited" : "Withdrew") + " " + Math.abs(amount));
    }

    @Override
    public double deposit(double amount) {
        balance += amount;
        processTransaction(amount);
        return balance;
    }

    @Override
    public double withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            processTransaction(-amount);
        } else {
            System.out.println("Transaction failed: Insufficient funds");
        }
        return balance;
    }

    @Override
    public double checkBalance() {
        System.out.println("Current Balance: " + balance);
        return balance;
    }
}


