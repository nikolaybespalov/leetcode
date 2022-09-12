package com.github.nikolaybespalov.leetcode;

/**
 * @see <a href="https://leetcode.com/problems/number-of-1-bits/">191. Number of 1 Bits</a>
 */
public class A191NumberOf1Bits {
    public int hammingWeight(int n) {
        int ans = 0;

        while (n != 0) {
            n = n & (n - 1);
            ans++;
        }

        return ans;
    }
}
