package org.example.e139;

public class E139AccessModifiers {
        public static void main(String[] args) {
            System.out.println(replaceSpaces("hello world"));
            System.out.println(replaceSpaces("java is fun"));
            System.out.println(replaceSpaces("i love coding"));
        }

        // Apply different access modifiers here (private, default, protected, public)
        public static String replaceSpaces(String str) {
            return str.replace(' ', '_');
        }
    }


