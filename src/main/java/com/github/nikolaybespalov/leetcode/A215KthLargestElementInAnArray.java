package com.github.nikolaybespalov.leetcode;

/**
 * @see <a href="https://leetcode.com/problems/kth-largest-element-in-an-array/">215. Kth Largest Element in an Array</a>
 */
public class A215KthLargestElementInAnArray {
    private static final int MAX_VALUE = 10000;
    private static final int MIN_VALUE = -10000;

    public int findKthLargest(int[] nums, int k) {
        int[] table = new int[MAX_VALUE - MIN_VALUE + 1];

        for (int v : nums) {
            table[v + MAX_VALUE]++;
        }

        int i = table.length - 1;

        while (k > 0) {
            k -= table[i--];
        }

        return i + 1 - MAX_VALUE;
    }
}
