package com.github.nikolaybespalov.leetcode;

/**
 * @see <a href="https://leetcode.com/problems/climbing-stairs/">70. Climbing Stairs</a>
 */
public class A70ClimbingStairs {
    public int climbStairs(int n) {
        if (n == 0) {
            return 0;
        }

        int[] dp = new int[n + 2];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i < dp.length; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[dp.length - 1];
    }
}
