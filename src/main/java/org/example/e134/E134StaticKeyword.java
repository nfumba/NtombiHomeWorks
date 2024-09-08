package org.example.e134;

public class E134StaticKeyword {
        public static void main(String[] args) {
            System.out.println(countVowels("obama")); // Output: 3
            System.out.println(countVowels("happy friday! i love weekends")); // Output: 9
        }

        public static int countVowels(String s) {
            int count = 0;
            String vowels = "aeiouAEIOU";
            for (char c : s.toCharArray()) {
                if (vowels.indexOf(c) != -1) {
                    count++;
                }
            }
            return count;
        }
    }


