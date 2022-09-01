package com.github.nikolaybespalov.leetcode;

/**
 * @see <a href="https://leetcode.com/problems/maximum-subarray/">53. Maximum Subarray</a>
 */
public class A53MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int localSum = 0;
        int globalSum = Integer.MIN_VALUE;

        for (int num : nums) {
            localSum = Math.max(num, num + localSum);
            globalSum = Math.max(globalSum, localSum);
        }

        return globalSum;
    }

}
