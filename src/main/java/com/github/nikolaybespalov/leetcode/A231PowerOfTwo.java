package com.github.nikolaybespalov.leetcode;

/**
 * @see <a href="https://leetcode.com/problems/power-of-two/">231. Power of Two</a>
 */
public class A231PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }

        return (n & (n - 1)) == 0;
    }
}
