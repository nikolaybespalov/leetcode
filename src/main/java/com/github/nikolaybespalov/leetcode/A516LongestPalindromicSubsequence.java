package com.github.nikolaybespalov.leetcode;

/**
 * @see <a href="https://leetcode.com/problems/longest-palindromic-subsequence/">516. Longest Palindromic Subsequence</a>
 */
public class A516LongestPalindromicSubsequence {
    public int longestPalindromeSubseq(String s) {
        int ans = 1;

        for (int i = 0; i < s.length(); i++) {
            String ss = String.valueOf(s.charAt(i));

            for (int j = i + 1; j < s.length(); j++) {
                ss = ss + s.charAt(j);

                if (isPalindrome(ss)) {
                    ans = Math.max(ans, (ss).length());
                }
            }
        }

        return ans;
    }

    private boolean isPalindrome(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }

        return true;
    }
}
