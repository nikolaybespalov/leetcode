package com.github.nikolaybespalov.leetcode;

/**
 * @see <a href="https://leetcode.com/problems/search-a-2d-matrix/">74. Search a 2D Matrix</a>
 */
public class A74SearchA2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int firstIndex = 0;
        int lastIndex = m * n - 1;

        while(firstIndex <= lastIndex) {
            int midIndex = (lastIndex + firstIndex) / 2;

            int value = matrix[midIndex / n][midIndex % n];

            if (value == target) {
                return true;
            } else if (value < target) {
                firstIndex = midIndex + 1;
            } else {
                lastIndex = midIndex - 1;
            }
        }

        return false;
    }
}
