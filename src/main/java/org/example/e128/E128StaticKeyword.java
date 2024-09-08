package org.example.e128;

public class E128StaticKeyword {

    public static void main(String[] args) {
        String s1 = "12345";
        String s2 = "abcde";
        String mixed = mixString(s1, s2);
        System.out.println(mixed);

    }
    public static String mixString(String s1, String s2) {
        StringBuilder result = new StringBuilder();
        int length = Math.min(s1.length(), s2.length());

        for (int i = 0; i < length; i++) {
            result.append(s1.charAt(i));
            result.append(s2.charAt(i));
        }

        // Append the remaining characters, if any
        result.append(s1.substring(length));
        result.append(s2.substring(length));

        return result.toString();
    }




}