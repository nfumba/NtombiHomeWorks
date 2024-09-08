package org.example.e131;

public class E131StaticKeyword {
        public static void main(String[] args) {
            System.out.println(thirdLetter("hello there")); // Output: "hltr"
            System.out.println(thirdLetter("technology")); // Output: "thly"
        }

        public static String thirdLetter(String s) {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < s.length(); i += 3) {
                result.append(s.charAt(i));
            }
            return result.toString();
        }
    }


