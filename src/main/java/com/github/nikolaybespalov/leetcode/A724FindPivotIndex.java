package com.github.nikolaybespalov.leetcode;

/**
 * @see <a href="https://leetcode.com/problems/find-pivot-index/">724. Find Pivot Index</a>
 */
public class A724FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int sum = 0;

        for (int num : nums) {
            sum += num;
        }

        int leftSum = 0;
        int rightSum = sum;

        for (int i = 0; i < nums.length; i++) {
            rightSum -= nums[i];

            if (leftSum == rightSum) {
                return i;
            }

            leftSum += nums[i];
        }

        return -1;
    }
}
