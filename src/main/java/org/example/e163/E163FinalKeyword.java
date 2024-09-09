package org.example.e163;

public class E163FinalKeyword {
    public static void main(String[] args) {
        StringManipulator stringManipulator = new StringManipulator("hello");
        System.out.println(stringManipulator.reverseString());

        ArrayManipulator arrayManipulator = new ArrayManipulator();
        int[] array = {3, 4, 5, 6, 6};
        System.out.println(arrayManipulator.avgElements(array));
    }
}

class StringManipulator {
    private String str;

    public StringManipulator(String str) {
        this.str = str;
    }

    public final String reverseString() {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}

class ArrayManipulator {
    public final double avgElements(int[] array) {
        double sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }
}


