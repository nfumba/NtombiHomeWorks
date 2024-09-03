package org.example.e118;

public class E118JavaMethods {

    public static void main(String[] args) {
        System.out.println(spaceOut("Technology"));
    }
        // Students will write the code here.
        public static String spaceOut(String s) {
            String result = "";
            for (int i = 0; i < s.length(); i++) {
                result += s.charAt(i) + " ";
            }
            return result;
        }


    }

