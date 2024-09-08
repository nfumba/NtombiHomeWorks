package org.example.e130;

public class E130StaticKeyword {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        mystery(array);
        display(array);
    }

    public static void mystery(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] /= 2;
            } else {
                array[i] *= 10;
            }
        }
    }

    public static void display(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
     }
}
}
