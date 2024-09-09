package org.example.e149;

public class E149Inheritance {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 2020, "Corolla");
        car.displayCarInfo();
    }
}

class Vehicle {
    protected String make;
    protected int year;

    public Vehicle(String make, int year) {
        this.make = make;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Vehicle: " + make + ", Year: " + year);
    }
}

class Car extends Vehicle {
    private String model;

    public Car(String make, int year, String model) {
        super(make, year);
        this.model = model;
    }

    public void displayCarInfo() {
        displayInfo();
        System.out.println("Model: " + model);
    }
}

