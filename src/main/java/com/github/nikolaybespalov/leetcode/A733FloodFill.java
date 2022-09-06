package com.github.nikolaybespalov.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @see <a href="https://leetcode.com/problems/flood-fill/">733. Flood Fill</a>
 */
public class A733FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        Queue<int[]> q = new LinkedList<>();

        q.offer(new int[]{sr, sc});

        int sourceColor = image[sr][sc];

        while (!q.isEmpty()) {
            int[] a = q.poll();

            image[a[0]][a[1]] = color;

            if (isValid(image, a[0] - 1, a[1], color, sourceColor)) {
                q.offer(new int[]{a[0] - 1, a[1]});
            }

            if (isValid(image, a[0] + 1, a[1], color, sourceColor)) {
                q.offer(new int[]{a[0] + 1, a[1]});
            }

            if (isValid(image, a[0], a[1] - 1, color, sourceColor)) {
                q.offer(new int[]{a[0], a[1] - 1});
            }

            if (isValid(image, a[0], a[1] + 1, color, sourceColor)) {
                q.offer(new int[]{a[0], a[1] + 1});
            }
        }

        return image;
    }

    private static boolean isValid(int[][] image, int i, int j, int color, int sourceColor) {
        return !(i < 0 || j < 0 || i >= image.length || j >= image[0].length || image[i][j] == color || image[i][j] != sourceColor);
    }
}
