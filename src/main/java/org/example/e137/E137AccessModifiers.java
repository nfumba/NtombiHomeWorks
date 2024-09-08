package org.example.e137;

public class E137AccessModifiers {
        private String name;
        String city;
        protected String schoolName;
        public int batchNumber;

        public void display() {
            System.out.println("My name is " + name + " and I live in " + city + ". I study at " + schoolName + " in batch " + batchNumber);
        }

        public static void main(String[] args) {
            E137AccessModifiers obj = new E137AccessModifiers();
            obj.name = "John";
            obj.city = "Miami";
            obj.schoolName = "Syntax";
            obj.batchNumber = 9;
            obj.display();
        }
    }

