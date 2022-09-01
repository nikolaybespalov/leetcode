package com.github.nikolaybespalov.leetcode;

import java.util.HashMap;

/**
 * @see <a href="https://leetcode.com/problems/two-sum/">1. Two Sum</a>
 */
public class A1TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> valueToIndex = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int v = target - nums[i];

            if (valueToIndex.containsKey(v)) {
                return new int[]{valueToIndex.get(v), i};
            }

            valueToIndex.put(nums[i], i);
        }

        return null;
    }
}
