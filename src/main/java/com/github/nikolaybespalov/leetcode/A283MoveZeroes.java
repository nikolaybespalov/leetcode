package com.github.nikolaybespalov.leetcode;

/**
 * @see <a href="https://leetcode.com/problems/move-zeroes/">283. Move Zeroes</a>
 */
public class A283MoveZeroes {
    public void moveZeroes(int[] nums) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                swap(nums, k++, i);
            }
        }
    }

    private static void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
