package com.github.nikolaybespalov.leetcode;

/**
 * @see <a href="https://leetcode.com/problems/squares-of-a-sorted-array/">977. Squares of a Sorted Array</a>
 */
public class A977SquaresOfASortedArray {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];

        int leftIndex = 0;
        int rightIndex = nums.length - 1;
        int ansIndex = nums.length - 1;

        while (leftIndex <= rightIndex) {
            int left = nums[leftIndex];
            int right = nums[rightIndex];

            int leftSquare = left * left;
            int rightSquare = right * right;

            if (leftSquare < rightSquare) {
                ans[ansIndex--] = rightSquare;
                rightIndex--;
            } else {
                ans[ansIndex--] = leftSquare;
                leftIndex++;
            }
        }

        return ans;
    }
}
