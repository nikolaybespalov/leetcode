package com.github.nikolaybespalov.leetcode;

import java.util.Arrays;

/**
 * @see <a href=""https://leetcode.com/problems/number-of-longest-increasing-subsequence/>673. Number of Longest Increasing Subsequence</>
 */
public class A673NumberOfLongestIncreasingSubsequence {
    public int findNumberOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);

        int[] count = new int[nums.length];
        Arrays.fill(count, 1);

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[i] < nums[j]) {
                    if (dp[i] + 1 > dp[j]) {
                        dp[j] = dp[i] + 1;
                        count[j] = count[i];
                    } else if (dp[i] + 1 == dp[j]) {
                        count[j] += count[i];
                    }
                }
            }
        }

        int max = Arrays.stream(dp).max().orElse(0);

        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            if (dp[i] == max) {
                ans += count[i];
            }
        }

        return ans;
    }
}
