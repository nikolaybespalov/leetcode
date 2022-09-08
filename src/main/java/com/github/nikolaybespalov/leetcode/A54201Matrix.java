package com.github.nikolaybespalov.leetcode;

import java.util.Arrays;

/**
 * @see <a href="https://leetcode.com/problems/01-matrix/">542. 01 Matrix</a>
 */
public class A54201Matrix {
    public int[][] updateMatrix(int[][] mat) {
        int[][] dp = new int[mat.length + 2][mat[0].length + 2];

        for (int[] a : dp) {
            Arrays.fill(a, Integer.MAX_VALUE - 1);
        }

        for (int i = 1; i < dp.length - 1; i++) {
            for (int j = 1; j < dp[0].length - 1; j++) {
                if (mat[i - 1][j - 1] != 0) {
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j] + 1, dp[i][j - 1] + 1), dp[i][j]);
                } else {
                    dp[i][j] = 0;
                }
            }
        }

        for (int i = dp.length - 2; i > 0; i--) {
            for (int j = dp[0].length - 2; j > 0; j--) {
                if (mat[i - 1][j - 1] != 0) {
                    dp[i][j] = Math.min(Math.min(dp[i + 1][j] + 1, dp[i][j + 1] + 1), dp[i][j]);
                } else {
                    dp[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < mat.length; i++) {
            System.arraycopy(dp[i + 1], 1, mat[i], 0, mat[0].length);
        }

        return mat;
    }
}
