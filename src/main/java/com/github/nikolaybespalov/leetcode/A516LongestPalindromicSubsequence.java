package com.github.nikolaybespalov.leetcode;

/**
 * @see <a href="https://leetcode.com/problems/longest-palindromic-subsequence/">516. Longest Palindromic Subsequence</a>
 */
public class A516LongestPalindromicSubsequence {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();

        int[][] dp = new int[n][n];

        return longestPalindromeSubseq(s, 0, n - 1, dp);
    }

    private int longestPalindromeSubseq(String s, int firstIndex, int lastIndex, int[][] dp) {
        if (firstIndex > lastIndex) {
            return dp[firstIndex][lastIndex] = 0;
        }

        if (firstIndex == lastIndex) {
            return dp[firstIndex][lastIndex] = 1;
        }

        if (dp[firstIndex][lastIndex] != 0) {
            return dp[firstIndex][lastIndex];
        }

        if (s.charAt(firstIndex) == s.charAt(lastIndex)) {
            return dp[firstIndex][lastIndex] = 2 + longestPalindromeSubseq(s, firstIndex + 1, lastIndex - 1, dp);
        } else {
            return dp[firstIndex][lastIndex] = Math.max(longestPalindromeSubseq(s, firstIndex + 1, lastIndex, dp),
                    longestPalindromeSubseq(s, firstIndex, lastIndex - 1, dp));
        }
    }
}
