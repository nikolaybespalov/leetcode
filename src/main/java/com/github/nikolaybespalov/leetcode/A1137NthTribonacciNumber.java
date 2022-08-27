package com.github.nikolaybespalov.leetcode;

/**
 * @see <a href="https://leetcode.com/problems/n-th-tribonacci-number/">1137. N-th Tribonacci Number</a>
 */
public class A1137NthTribonacciNumber {
    public int tribonacci(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        if (n == 2) {
            return 1;
        }

        int a = 0;
        int b = 1;
        int c = 1;
        int ans = a + b + c;

        for (int i = 2; i < n; i++) {
            ans = a + b + c;
            a = b;
            b = c;
            c = ans;
        }

        return ans;
    }
}
