package org.example.e154;

public class E154SuperKeyword {
    public static void main(String[] args) {
        WashingMachine washingMachine1 = new WashingMachine();
        WashingMachine washingMachine2 = new WashingMachine(500, 7);
    }
}

class Appliance {
    public Appliance() {
        System.out.println("Appliance Constructor without argument");
    }

    public Appliance(int wattage) {
        System.out.println("Wattage: " + wattage);
    }
}

class WashingMachine extends Appliance {
    public WashingMachine() {
        System.out.println("WashingMachine Constructor without argument");
    }

    public WashingMachine(int wattage, int capacity) {
        super(wattage);
        System.out.println("Capacity: " + capacity);
    }
}
