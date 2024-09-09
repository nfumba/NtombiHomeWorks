package org.example.e157;

public class E157MethodOverloading {
    public static void main(String[] args) {
        TransactionCalculator calculator = new TransactionCalculator();
        System.out.println(calculator.calculateProfit(100, 20, 30, 10, 40, 20, 50, 30));
        System.out.println(calculator.calculateProfit(80, 30, 20, 10, 30, 20));
        System.out.println(calculator.calculateProfit(50, 30));
    }
}

class TransactionCalculator {
    public int calculateProfit(int revenue1, int cost1) {
        return revenue1 - cost1;
    }

    public int calculateProfit(int revenue1, int cost1, int revenue2, int cost2) {
        return (revenue1 + revenue2) - (cost1 + cost2);
    }

    public int calculateProfit(int revenue1, int cost1, int revenue2, int cost2, int revenue3, int cost3) {
        return (revenue1 + revenue2 + revenue3) - (cost1 + cost2 + cost3);
    }

    public int calculateProfit(int revenue1, int cost1, int revenue2, int cost2, int revenue3, int cost3, int revenue4, int cost4) {
        return (revenue1 + revenue2 + revenue3 + revenue4) - (cost1 + cost2 + cost3 + cost4);
    }
}


