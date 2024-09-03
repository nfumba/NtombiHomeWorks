package org.example.e119;

public class E119JavaMethods {
    public static void main(String[] args) {
        System.out.println(censorLetter("computer science",'e'));

    }
    // Students will write the code here.
    public static String censorLetter(String s, char c) {
        return s.replace(String.valueOf(c), "*");
    }



}
