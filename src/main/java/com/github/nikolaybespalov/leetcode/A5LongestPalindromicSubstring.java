package com.github.nikolaybespalov.leetcode;

/**
 * @see <a href="https://leetcode.com/problems/longest-palindromic-substring/">5. Longest Palindromic Substring</a>
 */
public class A5LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        String ans = "";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length() + 1; j++) {
                if (j - i > ans.length() && isPalindrome(s, i, j)) {
                    ans = s.substring(i, j);
                }
            }
        }

        return ans;
    }

    private boolean isPalindrome(String s, int i, int j) {
        int n = j - i;

        for (int i1 = 0; i1 < n / 2; i1++) {
            if (s.charAt(i1 + i) != s.charAt(j - i1 - 1)) {
                return false;
            }
        }

        return true;
    }
}
