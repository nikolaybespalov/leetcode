package com.github.nikolaybespalov.leetcode;

/**
 * @see <a href="https://leetcode.com/problems/number-of-islands/">200. Number of Islands</a>
 */
public class A200NumberOfIslands {
    public int numIslands(char[][] grid) {
        int ans = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (dfs(grid, i, j) != 0) {
                    ans++;
                }
            }
        }

        return ans;
    }

    private int dfs(char[][] grid, int i, int j) {
        if (!isValid(grid, i, j)) {
            return 0;
        }

        grid[i][j] = '0';

        return 1 + dfs(grid, i - 1, j)
                + dfs(grid, i + 1, j)
                + dfs(grid, i, j - 1)
                + dfs(grid, i, j + 1);
    }

    private boolean isValid(char[][] grid, int i, int j) {
        return i >= 0 && i < grid.length && j >= 0 && j < grid[0].length && grid[i][j] != '0';
    }
}
