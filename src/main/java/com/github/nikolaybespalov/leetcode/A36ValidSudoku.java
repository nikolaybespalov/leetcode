package com.github.nikolaybespalov.leetcode;

/**
 * @see <a href="https://leetcode.com/problems/valid-sudoku/">36. Valid Sudoku</a>
 */
public class A36ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            boolean[] row = new boolean[9];
            boolean[] col = new boolean[9];
            boolean[] box = new boolean[9];

            for (int j = 0; j < 9; j++) {
                char v = board[i][j];

                if (v != '.')
                    if (row[v - '1'])
                        return false;
                    else
                        row[v - '1'] = true;

                v = board[j][i];

                if (v != '.')
                    if (col[v - '1'])
                        return false;
                    else
                        col[v - '1'] = true;

                int r = i / 3 * 3 + j / 3;
                int c = i % 3 * 3 + j % 3;

                v = board[r][c];

                if (v != '.')
                    if (box[v - '1'])
                        return false;
                    else
                        box[v - '1'] = true;
            }
        }

        return true;
    }
}
