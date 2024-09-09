package org.example.e150;

public class E150Inheritance {
    public static void main(String[] args) {
        Employee employee = new Employee("Joe", "Smith", 35, 35000);
        employee.printEmployeeDetails();

        Student student = new Student("Adam", "Smith", 15, 0, 10);
        student.printStudentDetails();

        Retiree retiree = new Retiree("Frank", "Smith", 15, 0, 10, "tour");
        retiree.printRetireeDetails();
    }
}

class Person {
    private String name;
    private String lastName;
    private int age;

    public Person(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
}

class Employee extends Person {
    private int salary;

    public Employee(String name, String lastName, int age, int salary) {
        super(name, lastName, age);
        this.salary = salary;
    }

    public void printEmployeeDetails() {
        System.out.println(getName() + " " + getLastName() + " " + getAge() + " " + salary);
    }
}

class Student extends Employee {
    private int grade;

    public Student(String name, String lastName, int age, int salary, int grade) {
        super(name, lastName, age, salary);
        this.grade = grade;
    }

    public void printStudentDetails() {
        System.out.println(getName() + " " + getLastName() + " " + getAge() + " " + grade);
    }
}

class Retiree extends Student {
    private String seniorActivity;

    public Retiree(String name, String lastName, int age, int salary, int grade, String seniorActivity) {
        super(name, lastName, age, salary, grade);
        this.seniorActivity = seniorActivity;
    }

    public void printRetireeDetails() {
        System.out.println(getName() + " " + getLastName() + " " + getAge() + " " + seniorActivity);
    }
}

