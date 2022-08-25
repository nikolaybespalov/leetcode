package com.github.nikolaybespalov.leetcode;

import java.util.*;

/**
 * @see <a href="https://leetcode.com/problems/longest-increasing-subsequence/">300. Longest Increasing Subsequence</>
 */
public class A300LongestIncreasingSubsequence {
    public int lengthOfLIS(int[] nums) {
        return lengthOfLISNLogN(nums);
    }

    /**
     * Compute length of LIS for NlogN time complexity.
     *
     * @param nums an integer array
     * @return length of LIS
     */
    public int lengthOfLISNLogN(int[] nums) {
        ArrayList<Integer> lis = new ArrayList<>();
        lis.add(nums[0]);

        for (int i = 1; i < nums.length; i++) {
            if (lis.get(lis.size() - 1) < nums[i]) {
                lis.add(nums[i]);
            } else {
                int position = Collections.binarySearch(lis, nums[i]);

                if (position < 0) {
                    lis.set(Math.abs(position) - 1, nums[i]);
                }
            }
        }

        return lis.size();
    }

    /**
     * Compute length of LIS for N*N time complexity.
     *
     * @param nums an integer array
     * @return length of LIS
     */
    public int lengthOfLISNN(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[i] < nums[j]) {
                    dp[j] = Math.max(dp[i] + 1, dp[j]);
                }
            }
        }

        return Arrays.stream(dp).max().orElse(0);
    }
}
