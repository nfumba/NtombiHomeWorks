package org.example.e180;
import java.util.Collections;
import java.util.LinkedList;


public class E180List {
    public static void main(String[] args){
        LinkedList<Integer> employeeAges = new LinkedList<>();

        // Add employee ages
        employeeAges.add(20);
        employeeAges.add(30);
        employeeAges.add(35);
        employeeAges.add(40);
        employeeAges.add(45);
        employeeAges.add(50);
        employeeAges.add(55);
        employeeAges.add(60);
        employeeAges.add(65);
        employeeAges.add(25);

        // Filter ages
        for (int i = 0; i < employeeAges.size(); i++) {
            if (employeeAges.get(i) < 25 || employeeAges.get(i) > 60) {
                employeeAges.remove(i);
                i--;
            }
        }

        // Sort the remaining ages
        Collections.sort(employeeAges);

        // Calculate and print the average age
        int sum = 0;
        for (int age : employeeAges) {
            sum += age;
        }
        double averageAge = (double) sum / employeeAges.size();

        // Print the remaining ages and the average
        System.out.println("Remaining ages: " + employeeAges);
        System.out.println("Average age: " + averageAge);
    }
}
