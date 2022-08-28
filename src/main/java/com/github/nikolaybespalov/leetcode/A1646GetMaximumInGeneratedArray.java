package com.github.nikolaybespalov.leetcode;

/**
 * @see <a href="https://leetcode.com/problems/get-maximum-in-generated-array/">1646. Get Maximum in Generated Array</a>
 */
public class A1646GetMaximumInGeneratedArray {
    public int getMaximumGenerated(int n) {
        int[] dp = new int[n + 1];

        int ans;

        dp[0] = ans = 0;

        if (n >= 1) {
            dp[1] = ans = 1;
        }

        for (int i = 2; i < n + 1; i += 1) {
            if (i % 2 == 0) {
                dp[i] = dp[i / 2];
            } else {
                dp[i] = dp[i / 2] + dp[i / 2 + i % 2];
            }

            ans = Math.max(ans, dp[i]);
        }

        return ans;
    }
}
