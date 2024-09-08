package org.example.e143;

public class E143Constructor {
    public static void main(String[] args) {
        Car obj1 = new Car("Toyota", "Prius", 4, 120, 30000.0);
        obj1.display();

        Car obj2 = new Car("Toyota", "Prius", 120, 30000.0);
        obj2.display();

        Car obj3 = new Car(4, 120, 30000.0);
        obj3.display();

        Car obj4 = new Car("Toyota", "Prius", 4);
        obj4.display();
    }
}

class Car {
    String make;
    String model;
    int numberOfDoors;
    int topSpeed;
    double price;

    public Car(String make, String model, int numberOfDoors, int topSpeed, double price) {
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
        this.topSpeed = topSpeed;
        this.price = price;
    }

    public Car(String make, String model, int topSpeed, double price) {
        this(make, model, 4, topSpeed, price);
    }

    public Car(int numberOfDoors, int topSpeed, double price) {
        this("unknown", "unknown", numberOfDoors, topSpeed, price);
    }

    public Car(String make, String model, int numberOfDoors) {
        this(make, model, numberOfDoors, 90, 0);
    }

    public void display() {
        System.out.println(make + " " + model + " " + numberOfDoors + " " + topSpeed + " " + price);

    }
}


