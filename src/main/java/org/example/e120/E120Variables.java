package org.example.e120;

public class E120Variables {
    // Declare 3 instance variables: year, school name, and batch number
    public static class Student {

        int year;
        String schoolName;
        int batchNumber;


        public static void main(String[] args) {
            Student student = new Student();

            // Access variables from the main method and assign specific values to them
            student.year = 2024;
            student.schoolName = "Syntax";
            student.batchNumber = 6;


            // Print values of your variables in the specified format
            System.out.print("I am a student of " + student.batchNumber + " ");
            System.out.print("studying at " + student.schoolName + " ");
            System.out.print("in the year of" + student.year +" ");
        }
    }
}
