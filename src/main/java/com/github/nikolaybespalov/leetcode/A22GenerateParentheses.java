package com.github.nikolaybespalov.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @see <a href="https://leetcode.com/problems/generate-parentheses/">22. Generate Parentheses</a>
 */
public class A22GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        return generateParenthesis("", n, 0, 0);
    }

    private List<String> generateParenthesis(String s, int n, int left, int right) {
        List<String> list = new ArrayList<>();

        if (left == right && left == n) {
            list.add(s);
        }

        if (left < n) {
            list.addAll(generateParenthesis(s + '(', n, left + 1, right));
        }

        if (right < left) {
            list.addAll(generateParenthesis(s + ')', n, left, right + 1));
        }

        return list;
    }
}
