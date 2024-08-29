package org.example.e81;

public class E81Arrays {
    public static void main(String[] args) {
        // Declare and initialize the 2D array with the given values
        int[][] a = {
                {-5, -2, -3, 7},
                {1, -5, -2, 2},
                {1, -2, 3, -4}
        };

        // Use nested loops to iterate through the 2D array and sum the elements that are on even indexes and even rows
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) { // even row
                for (int j = 0; j < a[i].length; j++) {
                    if (j % 2 == 0) { // even index
                        sum += a[i][j];
                    }
                }
            }
        }


        // Print the calculated sum
        System.out.println(sum);
    }
}
