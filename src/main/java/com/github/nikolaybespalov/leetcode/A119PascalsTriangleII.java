package com.github.nikolaybespalov.leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @see <a href="https://leetcode.com/problems/pascals-triangle-ii/">119. Pascal's Triangle II</a>
 */
public class A119PascalsTriangleII {
    public List<Integer> getRow(int rowIndex) {
        int[] prev = new int[1];
        prev[0] = 1;

        int[] ans = prev;

        for (int i = 1; i <= rowIndex; i++) {
            ans = new int[prev.length + 1];

            ans[0] = 1;

            for (int j = 1; j < ans.length - 1; j++) {
                ans[j] = prev[j - 1] + prev[j];
            }

            ans[ans.length - 1] = 1;

            prev = ans;
        }

        return Arrays.stream(ans).boxed().collect(Collectors.toList());
    }
}
