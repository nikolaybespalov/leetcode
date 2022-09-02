package com.github.nikolaybespalov.leetcode;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @see <a href="https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/">167. Two Sum II - Input Array Is Sorted</a>
 */
public class A167TwoSumIIInputArrayIsSorted {
    public int[] twoSum(int[] numbers, int target) {
        int[] map = new int[2001];

        for (int i = 0; i < numbers.length; i++) {
            int index = numbers[i] + 1000;
            int value = numbers[i];
            map[index] = target - value;
        }

        for (int i = 0; i < numbers.length; i++) {
            int v = target - numbers[i];

            if (map[numbers[i] + 1000] == v) {
                return new int[]{numbers[i] + 1000, i};
            }

        }

        return null;
    }
}
