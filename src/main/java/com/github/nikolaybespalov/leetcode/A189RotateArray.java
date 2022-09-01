package com.github.nikolaybespalov.leetcode;

/**
 * @see <a href="https://leetcode.com/problems/rotate-array/">189. Rotate Array</a>
 */
public class A189RotateArray {
    public void rotate(int[] nums, int k) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[(i + k) % nums.length] = nums[i];
        }

        System.arraycopy(ans, 0, nums, 0, ans.length);
    }
}
