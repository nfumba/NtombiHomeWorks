package org.example.e135;

public class E135StaticKeyword {
    public static void main(String[] args) {
        System.out.println(surround("abcabcabc", "c")); // Output: "ab(c)ab(c)ab(c)"
        System.out.println(surround("technology", "o")); // Output: "techn(o)l(o)gy"
    }

    public static String surround(String s, String search_term) {
        return s.replace(search_term, "(" + search_term + ")");
    }
}

