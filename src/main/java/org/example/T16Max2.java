package org.example;

import java.util.Arrays;

public class T16Max2 {
    public static int max2(int[] nums) {
        if (nums == null || nums.length < 2) {
            throw new IllegalArgumentException();
        }

        int max = nums[0];
        int maxInd = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                maxInd = i;
            }
        }

        int prevMax = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > prevMax && i != maxInd) {
                prevMax = nums[i];
                maxInd = i;
            }
        }

        return prevMax;
    }

    public static void main(String[] args) {
        int[] arr = {3, 9, 1, 2, 7};

        System.out.println(max2(arr));
    }
}
