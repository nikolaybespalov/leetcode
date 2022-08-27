package com.github.nikolaybespalov.leetcode;

/**
 * @see <a href="https://leetcode.com/problems/min-cost-climbing-stairs/">746. Min Cost Climbing Stairs</a>
 */
public class A746MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length + 2];

        dp[0] = 0;
        dp[1] = 0;

        System.arraycopy(cost, 0, dp, 2, cost.length);

        for (int i = 2; i < dp.length; i++) {
            dp[i] += Math.min(dp[i - 1], dp[i - 2]);
        }

        return Math.min(dp[dp.length - 1], dp[dp.length - 2]);
    }
}
