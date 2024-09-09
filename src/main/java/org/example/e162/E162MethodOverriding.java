package org.example.e162;

public class E162MethodOverriding {
    public static void main(String[] args) {
        Animal[] animals = new Animal[] {
                new Cat(),
                new Kitten1(),
                new Kitten2(),
                new Kitten3()
        };

        for (Animal animal : animals) {
            animal.eat();
            animal.sleep();
        }

        Cat cat = new Cat();
        cat.makeSound();
    }
}

class Animal {
    private String type;

    public Animal(String type) {
        this.type = type;
    }

    public void eat() {
        System.out.println("I am an animal eating");
    }

    protected void sleep() {
        System.out.println("I am an animal sleeping");
    }

    void makeSound() {
        System.out.println("I am an animal making sound");
    }

    private void roam() {
        System.out.println("I am an animal roaming");
    }
}

class Cat extends Animal {
    public Cat() {
        super("Cat");
    }

    @Override
    public void eat() {
        System.out.println("Cat eats");
    }

    @Override
    protected void sleep() {
        System.out.println("Cat sleeps a lot");
    }

    @Override
    void makeSound() {
        System.out.println("Cat makes a sound");
    }
}

class Kitten1 extends Cat {
    @Override
    public void eat() {
        System.out.println("kitten1 eats milk");
    }
}

class Kitten2 extends Cat {
    @Override
    public void eat() {
        System.out.println("kitten2 eats snacks");
    }
}

class Kitten3 extends Cat {
    @Override
    public void eat() {
        System.out.println("kitten3 eats everything");
    }
}
