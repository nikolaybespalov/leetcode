package com.github.nikolaybespalov.leetcode;

/**
 * @see <a href="https://leetcode.com/problems/max-area-of-island/">695. Max Area of Island</a>
 */
public class A695MaxAreaOfIsland {
    private static final int[][] DIRS = new int[][]{
            {-1, 0}, {1, 0},
            {0, -1}, {0, 1}
    };

    public int maxAreaOfIsland(int[][] grid) {
        int ans = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    ans = Math.max(ans, dfs(grid, i, j));
                }
            }
        }


        return ans;
    }

    private int dfs(int[][] grid, int i, int j) {
        if (!isValid(grid, i, j)) {
            return 0;
        }

        grid[i][j] = 0;
        int s = 1;

        for (int[] d : DIRS) {
            s += dfs(grid, i + d[0], j + d[1]);
        }

        return s;
    }

    private static boolean isValid(int[][] grid, int i, int j) {
        return i >= 0 && j >= 0 && i < grid.length && j < grid[0].length
                && grid[i][j] != 0;
    }
}
