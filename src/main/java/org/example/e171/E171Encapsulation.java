package org.example.e171;

public class E171Encapsulation {
    public static void main(String[] args) {
        Employee employee = new Employee();
        System.out.println("Employee Name: " + employee.getEmpName());
        System.out.println("Employee Age: " + employee.getEmpAge());
    }
}

class Employee {
    private String empName = "John";
    private int empAge = 30;

    public String getEmpName() {
        return empName;
    }

    public int getEmpAge() {
        return empAge;
    }
}
