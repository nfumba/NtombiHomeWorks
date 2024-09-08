package org.example.e144;

public class E144Constructor {
    public static void main(String[] args) {
        StoreProduct product1 = new StoreProduct("Eggs", 3.0, "Produce", true, 10);
        product1.display();

        StoreProduct product2 = new StoreProduct("Paper Towels", 2.0, false, 24);
        product2.display();

        StoreProduct product3 = new StoreProduct("Paper Towels", 2.0, 0);
        product3.display();
    }
}

class StoreProduct {
    String label;
    double price;
    String category;
    boolean hasExpiration;
    int stock;

    public StoreProduct(String label, double price, String category, boolean hasExpiration, int stock) {
        this.label = label;
        this.price = price;
        this.category = category;
        this.hasExpiration = hasExpiration;
        this.stock = stock;
    }

    public StoreProduct(String label, double price, boolean hasExpiration, int stock) {
        this(label, price, "misc", hasExpiration, stock);
    }

    public StoreProduct(String label, double price, int stock) {
        this(label, price, "misc", false, stock);
    }

    public void display() {
        System.out.println(label + " " + price + " " + category + " " + hasExpiration + " " + stock);
    }
}
