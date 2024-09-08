package org.example.e133;

public class E133StaticKeyword {
    public static void main(String[] args) {
            System.out.println(countA("aaa")); // Output: 3
            System.out.println(countA("aaBBdf8k3AAadnklA")); // Output: 3
        }

        public static int countA(String s) {
            int count = 0;
            for (char c : s.toCharArray()) {
                if (c == 'a' || c == 'A') {
                    count++;
                }
            }
            return count;
        }
    }


