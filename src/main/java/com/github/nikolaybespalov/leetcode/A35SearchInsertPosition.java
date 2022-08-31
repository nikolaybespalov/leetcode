package com.github.nikolaybespalov.leetcode;

/**
 * @see <a href="https://leetcode.com/problems/search-insert-position/">35. Search Insert Position</a>
 */
public class A35SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
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

        return startIndex;
    }
}
