package com.github.nikolaybespalov.leetcode;

/**
 * @see <a href="https://leetcode.com/problems/binary-search/">704. Binary Search</a>
 */
public class A704BinarySearch {
    public int search(int[] nums, int target) {
        int startIndex = 0;
        int endIndex = nums.length - 1;

        while (startIndex <= endIndex) {
            int midIndex = (startIndex + endIndex) / 2;
            int midValue = nums[midIndex];

            if (midValue == target) {
                return midIndex;
            } else if (midValue < target) {
                startIndex = midIndex + 1;
            } else {
                endIndex = midIndex - 1;
            }
        }

        return -1;
    }
}
