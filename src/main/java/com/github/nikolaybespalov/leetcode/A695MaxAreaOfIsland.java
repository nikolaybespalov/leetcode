package com.github.nikolaybespalov.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @see <a href="https://leetcode.com/problems/max-area-of-island/">695. Max Area of Island</a>
 */
public class A695MaxAreaOfIsland {
    public int maxAreaOfIsland(int[][] grid) {
        int[][] grid2 = new int[grid.length][grid[0].length];

        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0, 0});

        int cur = 0;
        int ans = 0;

        while (!q.isEmpty()) {
            int[] cell = q.poll();
            if (grid2[cell[0]][cell[1]] != 0) {
                continue;
            }

            grid2[cell[0]][cell[1]] = 1;

            if (grid[cell[0]][cell[1]] == 0) {
                ans = Math.max(ans, cur);
                cur = 0;
            } else {
                cur++;
                ans = Math.max(ans, cur);
            }
        }

        return ans;
    }
}
