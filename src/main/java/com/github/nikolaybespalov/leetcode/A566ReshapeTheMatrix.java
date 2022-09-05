package com.github.nikolaybespalov.leetcode;

/**
 * @see <a href="https://leetcode.com/problems/reshape-the-matrix/">566. Reshape the Matrix</a>
 */
public class A566ReshapeTheMatrix {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;

        if (r * c != m * n) {
            return mat;
        }

        int[][] ans = new int[r][c];

        for (int i = 0; i < r * c; i++) {
            ans[i / c][i % c] = mat[i / n][i % n];
        }

        return ans;
    }
}
