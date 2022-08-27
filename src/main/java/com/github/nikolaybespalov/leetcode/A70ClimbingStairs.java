package com.github.nikolaybespalov.leetcode;

/**
 * @see <a href="https://leetcode.com/problems/climbing-stairs/">70. Climbing Stairs</a>
 */
public class A70ClimbingStairs {
    public int climbStairs(int n) {
        if (n == 0) {
            return 0;
        }

        int a = 0;
        int b = 1;
        int ans = a + b;

        for (int i = 2; i < n + 2; i++) {
            ans = a + b;
            a = b;
            b = ans;
        }

        return ans;
    }
}
