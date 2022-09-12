package com.github.nikolaybespalov.leetcode;

import java.util.List;

/**
 * @see <a href="https://leetcode.com/problems/triangle/">120. Triangle</a>
 */
public class A120Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();

        Integer[][] memo = new Integer[n][n];

        return minimumTotal(triangle, memo, 0, 0);
    }

    private int minimumTotal(List<List<Integer>> triangle, Integer[][] memo, int i, int j) {
        if (i == triangle.size()) {
            return 0;
        }

        if (memo[i][j] == null) {
            memo[i][j] = triangle.get(i).get(j) + Math.min(
                    minimumTotal(triangle, memo, i + 1, j),
                    minimumTotal(triangle, memo, i + 1, j + 1)
            );
        }

        return memo[i][j];
    }
}
