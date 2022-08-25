package com.github.nikolaybespalov.leetcode;

/**
 * @see <a href="https://leetcode.com/problems/longest-continuous-increasing-subsequence/">674. Longest Continuous Increasing Subsequence</>
 */
public class A674LongestContinuousIncreasingSubsequence {
    public int findLengthOfLCIS(int[] nums) {
        int ans = 1;

        int currentMax = 1;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                currentMax++;
            } else {
                currentMax = 1;
            }

            ans = Math.max(ans, currentMax);
        }

        return ans;
    }
}
