package org.example.e140;

public class E140AccessModifiers {

    public static void main(String[] args) {
        String[] words = {"this", "is", "a", "long", "word"};
        System.out.println(maxLength(words));

        String[] words2 = {"java", "programming", "is", "fun"};
        System.out.println(maxLength(words2));
    }

    static String maxLength(String[] words) {
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }
}

