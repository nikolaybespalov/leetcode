package com.github.nikolaybespalov.leetcode;

/**
 * @see <a href="https://leetcode.com/problems/find-triangular-sum-of-an-array/">2221. Find Triangular Sum of an Array</a>
 */
public class A2221FindTriangularSumOfAnArray {
    public int triangularSum(int[] nums) {
        int n = nums.length;

        while (n > 1) {
            for (int j = 0; j < n - 1; j++) {
                nums[j] = (nums[j] + nums[j + 1]) % 10;
            }

            n--;
        }

        return nums[0];
    }
}
