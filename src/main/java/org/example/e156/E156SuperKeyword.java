package org.example.e156;

public class E156SuperKeyword {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.displaySound();
    }
}

class Animal {
    String sound = "Some generic animal sound";
}

class Dog extends Animal {
    String sound = "Bark";

    public void displaySound() {
        System.out.println(this.sound); // prints "Bark"
        System.out.println(super.sound); // prints "Some generic animal sound"
    }
}
