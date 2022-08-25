package com.github.nikolaybespalov.leetcode;

/**
 * @see <a href="https://leetcode.com/problems/longest-valid-parentheses/">32. Longest Valid Parentheses</a>
 */
public class A32LongestValidParentheses {
    public int longestValidParentheses(String s) {
        int n = s.length();

        int left1 = 0;
        int right1 = 0;
        int maxlength1 = 0;

        int left2 = 0;
        int right2 = 0;
        int maxlength2 = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(') {
                left1++;
            } else {
                right1++;
            }

            if (left1 == right1) {
                maxlength1 = Math.max(maxlength1, left1 + right1);
            } else if (right1 >= left1) {
                left1 = right1 = 0;
            }

            if (s.charAt(n - i - 1) == '(') {
                left2++;
            } else {
                right2++;
            }

            if (left2 == right2) {
                maxlength2 = Math.max(maxlength2, left2 + right2);
            } else if (left2 >= right2) {
                left2 = right2 = 0;
            }
        }

        return Math.max(maxlength1, maxlength2);
    }
}
