package org.example.e132;

public class E132StaticKeyword {
        public static void main(String[] args) {
            int[][] nums = {
                    {1, 2, 3, 4},
                    {4, 5, 6, 7},
                    {1, 3, 5, 7}
            };

            int[][] reducedNums = reduce10(nums);

            for (int i = 0; i < reducedNums.length; i++) {
                for (int j = 0; j < reducedNums[i].length; j++) {
                    System.out.print(reducedNums[i][j] + " ");
                }
                System.out.println();
            }
        }

        public static int[][] reduce10(int[][] nums) {
            int[][] reducedNums = new int[nums.length][];

            for (int i = 0; i < nums.length; i++) {
                reducedNums[i] = new int[nums[i].length];
                for (int j = 0; j < nums[i].length; j++) {
                    reducedNums[i][j] = nums[i][j] - 10;
                }
            }

            return reducedNums;
        }
    }




