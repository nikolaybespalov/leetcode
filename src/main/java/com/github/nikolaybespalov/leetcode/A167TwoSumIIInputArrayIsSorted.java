package com.github.nikolaybespalov.leetcode;

import java.util.Arrays;

/**
 * @see <a href="https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/">167. Two Sum II - Input Array Is Sorted</a>
 */
public class A167TwoSumIIInputArrayIsSorted {
    private static final int MIN_VALUE = -1000;
    private static final int MAX_VALUE = 1000;

    public int[] twoSum(int[] numbers, int target) {
        int[] map = new int[MAX_VALUE + 1 - MIN_VALUE + 1];
        Arrays.fill(map, Integer.MIN_VALUE);

        for (int i = 0; i < numbers.length; i++) {
            int v = target - numbers[i];
            int j = v + MAX_VALUE;

            if (map[j] != Integer.MIN_VALUE) {
                return new int[]{map[j] + 1, i + 1};
            }

            map[numbers[i] + MAX_VALUE] = i;
        }

        return null;
    }
}
