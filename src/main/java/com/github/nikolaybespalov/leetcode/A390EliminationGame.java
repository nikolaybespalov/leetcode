package com.github.nikolaybespalov.leetcode;

/**
 * @see <a href="https://leetcode.com/problems/elimination-game/">390. Elimination Game</a>
 */
public class A390EliminationGame {
    public int lastRemaining(int n) {
        return lastRemaining(n, 1, 1, true);
    }

    private int lastRemaining(int n, int head, int step, boolean leftToRight) {
        if (n == 1) {
            return head;
        } else if (leftToRight || n % 2 == 1) {
            return lastRemaining(n / 2, head + step, step * 2, !leftToRight);
        } else {
            return lastRemaining(n / 2, head, step * 2, true);
        }
    }
}
