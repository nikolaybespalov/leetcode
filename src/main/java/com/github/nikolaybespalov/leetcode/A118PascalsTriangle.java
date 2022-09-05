package com.github.nikolaybespalov.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @see <a href="https://leetcode.com/problems/pascals-triangle/">118. Pascal's Triangle</a>
 */
public class A118PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        if (numRows >= 1) {
            ans.add(Collections.singletonList(1));
        }

        for (int i = 1; i < numRows; i++) {
            int n = ans.get(i - 1).size() + 1;

            ArrayList<Integer> row = new ArrayList<>(n);

            row.add(1);

            List<Integer> prev = ans.get(i - 1);

            for (int j = 1; j < n - 1; j++) {
                row.add(prev.get(j - 1) + prev.get(j));
            }

            row.add(1);

            ans.add(row);
        }

        return ans;
    }
}
