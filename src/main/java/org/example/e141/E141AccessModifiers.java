package org.example.e141;

public class E141AccessModifiers {
    public static void main(String[] args) {
        int[] nums = {1, 5, 22, 3, 7};
        System.out.println(maxValue(nums));
    }

    public static int maxValue(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}

