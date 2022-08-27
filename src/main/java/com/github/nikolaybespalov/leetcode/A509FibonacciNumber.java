package com.github.nikolaybespalov.leetcode;

/**
 * @see <a href="https://leetcode.com/problems/fibonacci-number/">509. Fibonacci Number</a>
 */
public class A509FibonacciNumber {
    public int fib(int n) {
        if (n == 0) {
            return 0;
        }

        int a = 0;
        int b = 1;
        int ans = a + b;

        for (int i = 2; i < n + 1; i++) {
            ans = a + b;
            a = b;
            b = ans;
        }

        return ans;
    }
}
