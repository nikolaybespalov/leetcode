package com.github.nikolaybespalov.leetcode;

/**
 * @see <a href="https://leetcode.com/problems/regular-expression-matching/">10. Regular Expression Matching</a>
 */
public class A10RegularExpressionMatching {
    public boolean isMatch(String s, String p) {
        int n = s.length();
        int m = p.length();

        boolean[][] dp = new boolean[n + 1][m + 1];

        dp[0][0] = true;

        for (int j = 1; j <= m; j++) {
            if (p.charAt(j - 1) == '*' && dp[0][j - 2]) {
                dp[0][j] = true;
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (isMatch(s.charAt(i - 1), p.charAt(j - 1))) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (p.charAt(j - 1) == '*') {
                    if (!isMatch(s.charAt(i - 1), p.charAt(j - 2))) {
                        dp[i][j] = dp[i][j - 2];
                    } else {
                        dp[i][j] = dp[i][j - 2] || dp[i][j - 1] || dp[i - 1][j];
                    }
                }
            }
        }

        return dp[n][m];
    }

    private boolean isMatch(char a, char b) {
        return a == b || b == '.';
    }
}
