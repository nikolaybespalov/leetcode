package com.github.nikolaybespalov.leetcode;

import java.util.Arrays;

/**
 * @see <a href="https://leetcode.com/problems/rotting-oranges/">994. Rotting Oranges</a>
 */
public class A994RottingOranges {
    private static final int[][] DIRS = new int[][]{
            {-1, 0},
            {1, 0},
            {0, -1},
            {0, 1}
    };

    public int orangesRotting(int[][] grid) {
        int ans = 0;

        int[][] grid2 = new int[grid.length][];

        for (int i = 0; i < grid.length; i++) {
            grid2[i] = Arrays.copyOf(grid[i], grid[i].length);
        }

        while (true) {
            boolean f = false;

            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[i].length; j++) {
                    if (grid[i][j] == 2) {
                        for (int[] d : DIRS) {
                            if (isValid(grid, i + d[0], j + d[1])) {
                                grid2[i + d[0]][j + d[1]] = 2;
                                f = true;
                            }
                        }
                    }
                }
            }

            for (int i = 0; i < grid.length; i++) {
                System.arraycopy(grid2[i], 0, grid[i], 0, grid[i].length);
            }

            if (f) {
                ans++;
            } else {
                break;
            }
        }

        for (int[] row : grid) {
            for (int cell : row) {
                if (cell == 1) {
                    return -1;
                }
            }
        }

        return ans;
    }

    private boolean isValid(int[][] grid, int i, int j) {
        return i >= 0 && i < grid.length && j >= 0 && j < grid[0].length && grid[i][j] == 1;
    }
}
